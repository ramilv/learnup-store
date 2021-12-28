package shop.learnup.shop.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "cart_items")
public class CartItem {

    public CartItem(int itemId, int qty, double price, int cartId) {
        this.itemId = itemId;
        this.qty = qty;
        this.price = price;
        this.cartId = cartId;
    }

    public CartItem() {
    }

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "item_id")
    private int itemId;

    @Column(name = "qty")
    private int qty;

    @Column(name = "price")
    private double price;

    @Column(name = "cart_id")
    private int cartId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Cart cart;

    @OneToOne(optional = false)
    @JoinColumn(name = "item_id", referencedColumnName = "id", insertable = false, updatable = false)
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

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCartId(int cart_id) {
        this.cartId = cartId;
    }

}
