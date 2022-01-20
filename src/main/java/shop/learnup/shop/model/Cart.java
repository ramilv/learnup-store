package shop.learnup.shop.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {

    public Cart(int userId) {
        this.userId = userId;
    }

    public Cart() {
    }

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "user_id")
    private int userId;

    @OneToMany(mappedBy = "cart", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
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

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
