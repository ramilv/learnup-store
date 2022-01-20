package shop.learnup.shop.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemDto {

    @JsonProperty
    private int id;

    @JsonProperty
    private int itemId;

    @JsonProperty
    private int qty;

    @JsonProperty
    private double price;

    @JsonProperty
    private int cartId;

    @JsonIgnore
    private CartDto cart;

    @JsonIgnore
    private ItemDto item;

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

    public CartDto getCart() {
        return cart;
    }

    public ItemDto getItem() {
        return item;
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

    public void setCart(CartDto cart) {
        this.cart = cart;
    }

    public void setItem(ItemDto item) {
        this.item = item;
    }
}
