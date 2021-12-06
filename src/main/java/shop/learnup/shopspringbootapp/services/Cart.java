package shop.learnup.shopspringbootapp.services;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Cart {

    public static ArrayList<CartItem> cartItems = new ArrayList<>();

    public void addItem(CartItem cartItem) {
        Items items = new Items();
        Item item = items.getItemById(cartItem.id);
        if (item == null) {
            log.error("Товар с id=" + cartItem.id + " не найден");
        } else if (item.available < cartItem.qty) {
            log.error("Недостаточное количество для добавления товара id=" + cartItem.id + " в корзину");
        } else {
            cartItems.add(cartItem);
            log.info("Добавлен товар в корзину, id: " + cartItem.id + ", количество: " + cartItem.qty);
        }
    }
}
