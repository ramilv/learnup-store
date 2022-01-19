package shop.learnup.shop.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    private int id;
    private int orderId;
    private int itemId;
    private int qty;
    private double price;
    private double total;
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
