package shop.learnup.shop.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    public Order(Date date, int userId) {
        this.date = date;
        this.userId = userId;
    }

    public Order() {
    }

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "date_create")
    private Date date;

    @Column(name = "user_id")
    private int userId;

    @OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> orderItems;

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getUserId() {
        return userId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<OrderItem> getOrderItems() {
        return this.orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
