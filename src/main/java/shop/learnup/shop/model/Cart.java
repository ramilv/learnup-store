package shop.learnup.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    private int id;
    private int userId;
    private List<CartItem> cartItems;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
