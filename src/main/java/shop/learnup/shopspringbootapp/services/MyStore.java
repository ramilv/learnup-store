package shop.learnup.shopspringbootapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shopspringbootapp.annotations.Loggable;

import java.util.ArrayList;

@Service
@Slf4j
public class MyStore {

    public static Notificator notificator;

    @Autowired
    public MyStore(Notificator notificator) {
        MyStore.notificator = notificator;
    }

    @Loggable
    public void start() {
        log.info("Старт приложения");

        Items items = new Items();

        items.add(new Item("Тапочки", 120, 100));
        items.add(new Item("Ноутбук", 60000, 10));
        items.add(new Item("Кирпич", 90, 500));

        int id = 3;
        log.info("Ищем товара с id = " + id);
        Item item3 = items.getInfo(id);

        Cart cart = new Cart();
        cart.addItem(new CartItem(1, 10));
        cart.addItem(new CartItem(3, 5));

        Order.order(cart);


        log.info("Стоп приложения");
    }
}
