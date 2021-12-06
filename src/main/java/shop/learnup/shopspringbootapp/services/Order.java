package shop.learnup.shopspringbootapp.services;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Order {
    public static void order(Cart cart) {
        //здесь идет оформление заказа

        StringBuilder msg;
        msg = new StringBuilder("Заказ оформлен.\n Товары в заказе:");
        Items items = new Items();
        for (CartItem cartItem : cart.cartItems) {
            Item item = Items.getItemById(cartItem.id);
            msg.append("id: ").append(cartItem.id).append(", наименование: ").append(item.name).append(", кол-во: ").append(cartItem.qty).append("\n");
        }

        MyStore.notificator.send("customer@mail.com", "Новый заказ", msg.toString());

    }
}
