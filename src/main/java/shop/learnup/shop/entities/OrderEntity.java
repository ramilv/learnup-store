package shop.learnup.shop.entities;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderEntity {
    public OrderEntity(Date date) {
        this.date = date;
    }

    public OrderEntity(Date date, List<OrderItemEntity> orderItem) {
        this.date = date;
        this.orderItem = orderItem;
    }

    public OrderEntity() {
    }

    @Id
    @GeneratedValue
    protected int id;

    @Column(name = "date_create")
    protected Date date;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    protected List<OrderItemEntity> orderItem;

    public int getId() {
        return id;
    }

    public List<OrderItemEntity> getOrderItem() {
        return orderItem;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setOrderItem(OrderItemEntity orderItem) {
        this.orderItem = (List<OrderItemEntity>) orderItem;
    }
}
