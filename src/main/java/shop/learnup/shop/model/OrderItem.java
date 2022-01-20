package shop.learnup.shop.model;

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

    public int getId() {
        return id;
    }

    public int getOrderId() {
        return orderId;
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

    public double getTotal() {
        return total;
    }

    public Order getOrder() {
        return order;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public void setTotal(double total) {
        this.total = total;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
