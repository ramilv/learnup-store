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

    public int getId() {
        return id;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public int getCartId() {
        return cartId;
    }

    public Cart getCart() {
        return cart;
    }

    public Item getItem() {
        return item;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
