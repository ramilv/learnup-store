package shop.learnup.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.model.Order;
import shop.learnup.shop.repository.interfaces.OrderRepository;

import java.util.Collection;

@Service
public class OrderService  {
    private OrderRepository repository;

    @Autowired
    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public Collection<Order> getAllOrders() {
        return repository.getAllOrders();
    }

    public Order get(int id) {
        return repository.getOne(id);
    }

    public Order add(Order order) {
        order.setId(repository.getNewId());
        repository.save(order);
        return order;
    }

    public void delete(int id) {
        repository.delete(id);
    }

    public Order update(Order order) {
        repository.save(order);
        return repository.getOne(order.getId());
    }
}
