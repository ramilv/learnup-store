package shop.learnup.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {

    public OrderItem(int orderId, int itemId, int qty, double price, double total) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }

    public OrderItem() {
    }

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "order_id")
    private int orderId;

    @Column(name = "item_id")
    private int itemId;

    @Column(name = "qty")
    private int qty;

    @Column(name = "price")
    private double price;

    @Column(name = "total")
    private double total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Order order;

}
