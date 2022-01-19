package shop.learnup.shop.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import shop.learnup.shop.model.OrderItem;
import shop.learnup.shop.repository.interfaces.OrderItemRepository;

import java.util.*;

@Repository
@Primary
public class OrderItemRepositoryImpl implements OrderItemRepository {

    private final Map<Integer, OrderItem> orderItems = new HashMap<>();
    private static final Random RAND = new Random();

    @Override
    public Collection<OrderItem> getAllOrderItems() {
        return new ArrayList<>(orderItems.values());
    }

    @Override
    public OrderItem getOne(int id) {
        return orderItems.get(id);
    }

    @Override
    public boolean save(OrderItem orderItem) {
        orderItems.put(orderItem.getId(), orderItem);
        return true;
    }

    @Override
    public int getNewId() {
        return RAND.nextInt();
    }

    @Override
    public void delete(int id) {
        orderItems.remove(id);
    }
}
