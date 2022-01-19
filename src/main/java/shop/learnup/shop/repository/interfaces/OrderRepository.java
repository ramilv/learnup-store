package shop.learnup.shop.repository.interfaces;

import shop.learnup.shop.model.Order;

import java.util.Collection;

public interface OrderRepository {

    Collection<Order> getAllOrders();

    Order getOne(int id);

    boolean save(Order order);

    int getNewId();

    void delete(int id);
}
