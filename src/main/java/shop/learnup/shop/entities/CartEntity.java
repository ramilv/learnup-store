package shop.learnup.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "carts")
public class CartEntity {

    public CartEntity(int itemId, int qty, double price) {
        this.itemId = itemId;
        this.qty = qty;
        this.price = price;
    }

    public CartEntity() {
    }

    @Id
    @GeneratedValue
    protected int id;

    @Column(name = "item_id")
    protected int itemId;

    @Column(name = "qty")
    protected int qty;

    @Column(name = "price")
    protected double price;

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

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
