package shop.learnup.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import shop.learnup.shop.entities.Cart;
import shop.learnup.shop.entities.Item;
import shop.learnup.shop.services.MyStore;
import shop.learnup.shop.dao.services.CartService;
import shop.learnup.shop.dao.services.ItemService;
import shop.learnup.shop.dao.services.OrderService;

@SpringBootApplication
public class ShopSpringBootAppApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(ShopSpringBootAppApplication.class, args);
        MyStore myStore = ctx.getBean(MyStore.class);

        int userId = 1;

        Item item = myStore.addItem("Тапочки", 120.0, 100);

        Cart cart = myStore.addToCart(userId, item.getId(), 40);

        try {
            myStore.createOrder(cart);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    @Bean
    public MyStore myStore(ItemService itemService, CartService cartService, OrderService orderService) {
        return new MyStore(itemService, cartService, orderService);
    }

}
