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

}
