package shop.learnup.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

    private int id;
    private int itemId;
    private int qty;
    private double price;
    private int cartId;
    private Cart cart;
    private Item item;
}
