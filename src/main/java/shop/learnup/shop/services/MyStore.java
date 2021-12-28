package shop.learnup.shop.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import shop.learnup.shop.dao.services.CartService;
import shop.learnup.shop.dao.services.ItemService;
import shop.learnup.shop.entities.*;
import shop.learnup.shop.dao.services.OrderService;
import shop.learnup.shop.notificators.Notificator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.transaction.annotation.Propagation.REQUIRED;

@Slf4j
public class MyStore implements ApplicationContextAware {

    private ApplicationContext ctx;
    private ItemService itemService;
    private CartService cartService;
    private OrderService orderService;

    public MyStore(ItemService itemService, CartService cartService, OrderService orderService) {
        this.itemService = itemService;
        this.cartService = cartService;
        this.orderService = orderService;
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }

    public static Notificator notificator;

    @Autowired
    public MyStore(Notificator notificator) {
        MyStore.notificator = notificator;
    }

    public Item addItem(String name, double price, int available) {
        Item itemEntity = new Item(name, price, available);
        return itemService.create(itemEntity);
    }

    public Cart addToCart(int userId, int itemId, int qty) {
        List<CartItem> cartItems = new ArrayList<>();

        Cart cart = cartService.getByUser(userId);
        if (cart == null) {
            cart = new Cart(userId);
            cart = cartService.create(cart);
        } else {
            cartItems = cart.getCartItems();
        }
        Item item = itemService.get(itemId);
        cartItems.add(new CartItem(itemId, qty, item.getPrice(), cart.getId()));

        cart.setCartItems(cartItems);
        return cartService.update(cart);
    }

    @Transactional(
            propagation = REQUIRED,
            isolation = Isolation.DEFAULT,
            timeout = 2,
            readOnly = false)
    public Order createOrder(Cart cart) throws RuntimeException {

        List<OrderItem> orderItems = new ArrayList<>();

        if (cart == null) {
            System.out.println("Корзина пуста");
            return null;
        }
        Order order = new Order(new Date(), cart.getUserId());
        order = orderService.create(order);

        int orderId = order.getId();
        cart.getCartItems().forEach((cartItem) -> {
            Item item = itemService.get(cartItem.getItemId());
            if (item.getAvailable() >= cartItem.getQty()) {
                orderItems.add(new OrderItem(orderId, cartItem.getItemId(), cartItem.getQty(), cartItem.getPrice(), cartItem.getQty() * cartItem.getPrice()));
                item.setAvailable(item.getAvailable() - cartItem.getQty());
                itemService.update(item);
            } else {
                throw new RuntimeException("Недостаточно товара на складе");
            }
        });

        order.setOrderItems(orderItems);
        order = orderService.update(order);

        cartService.delete(cart.getId());

        return order;
    }

}
