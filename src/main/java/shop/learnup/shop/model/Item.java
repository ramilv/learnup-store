package shop.learnup.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    private Integer id;
    private String name;
    private Double price;
    private int available;
    private CartItem cartItem;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getAvailable() {
        return available;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }
}
