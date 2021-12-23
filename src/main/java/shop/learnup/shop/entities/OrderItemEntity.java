package shop.learnup.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItemEntity {

    public OrderItemEntity(int orderId, int itemId, int qtyId, double price, double total) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.qtyId = qtyId;
        this.price = price;
        this.total = total;
    }

    public OrderItemEntity() {
    }

    @Id
    @GeneratedValue
    protected int id;

    @Column(name = "order_id")
    protected int orderId;

    @Column(name = "item_id")
    protected int itemId;

    @Column(name = "qty")
    protected int qtyId;

    @Column(name = "price")
    protected double price;

    @Column(name = "total")
    protected double total;

}
