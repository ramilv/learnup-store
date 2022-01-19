package shop.learnup.shop.repository.interfaces;

import shop.learnup.shop.model.OrderItem;

import java.util.Collection;

public interface OrderItemRepository {

    Collection<OrderItem> getAllOrderItems();

    OrderItem getOne(int id);

    boolean save(OrderItem orderItem);

    int getNewId();

    void delete(int id);
}
