package shop.learnup.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    public Item(String name, Double price, int available) {
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public Item() {
    }

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "available")
    private int available;

    @OneToOne(mappedBy = "item", fetch = FetchType.EAGER)
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
}
