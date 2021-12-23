package shop.learnup.shop.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.CartEntity;
import shop.learnup.shop.entities.ItemEntity;
import shop.learnup.shop.entities.OrderEntity;
import shop.learnup.shop.entities.OrderItemEntity;
import shop.learnup.shop.repsitory.ItemRepository;
import shop.learnup.shop.services.interfaces.CartService;
import shop.learnup.shop.services.interfaces.ItemService;
import shop.learnup.shop.services.interfaces.OrderItemService;
import shop.learnup.shop.services.interfaces.OrderService;

import java.util.Date;

@Service
@Slf4j
public class MyStore {

    public static Notificator notificator;

    @Autowired
    public MyStore(Notificator notificator) {
        MyStore.notificator = notificator;
    }

    public void start(ConfigurableApplicationContext ctx) {
        log.info("Старт приложения");

 /*       ItemService itemService = ctx.getBean(ItemService.class);
        ItemEntity itemEntity = new ItemEntity("Тапочки", 120.0, true);
        itemService.create(itemEntity);
        itemService.getAll().forEach(System.out::println);*/


        CartService cartService = ctx.getBean(CartService.class);
        cartService.create(new CartEntity(5, 10, 100));
        cartService.create(new CartEntity(6, 12, 100));
        cartService.create(new CartEntity(7, 30, 100));

        cartService.getAll().forEach(System.out::println);

        OrderService orderService = ctx.getBean(OrderService.class);
        OrderItemService orderItemService = ctx.getBean(OrderItemService.class);

        OrderEntity orderEntity = orderService.create(new OrderEntity(new Date()));
        for (CartEntity cartItem : cartService.getAll()) {
            orderItemService.create(
                    new OrderItemEntity(orderEntity.getId(), cartItem.getItemId(), cartItem.getQty(), cartItem.getPrice(), cartItem.getQty() * cartItem.getPrice()));
        }

        log.info("Стоп приложения");
    }
}
