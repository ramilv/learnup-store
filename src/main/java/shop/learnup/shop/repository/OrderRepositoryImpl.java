package shop.learnup.shop.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import shop.learnup.shop.model.Order;
import shop.learnup.shop.repository.interfaces.OrderRepository;

import java.util.*;

@Repository
@Primary
public class OrderRepositoryImpl implements OrderRepository {

    private final Map<Integer, Order> orders = new HashMap<>();
    private static final Random RAND = new Random();

    @Override
    public Collection<Order> getAllOrders() {
        return new ArrayList<>(orders.values());
    }

    @Override
    public Order getOne(int id) {
        return orders.get(id);
    }

    @Override
    public boolean save(Order order) {
        orders.put(order.getId(), order);
        return true;
    }

    @Override
    public int getNewId() {
        return RAND.nextInt();
    }

    @Override
    public void delete(int id) {
        orders.remove(id);
    }
}
