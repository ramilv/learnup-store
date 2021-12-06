package shop.learnup.shopspringbootapp.services;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Items {

    public static Map<Integer, Item> items = new HashMap<>();

    public void add(Item item) {
        items.put(item.id, item);
        log.info("Добавлен новый товар, id: " + item.id);
    }

    public static Item getItemById(int id) {
        return items.get(id);
    }

    public static Item getInfo(int id) {
        Item item = getItemById(id);
        if (item == null) {
            log.info("Ничего не найдено");
        } else {
            log.info("Найден товар.");
            log.info("Наименование: " + item.name);
            log.info("Стоимость: " + item.price);
            log.info("Доступное количество: " + item.available);
        }
        return item;
    }
}
