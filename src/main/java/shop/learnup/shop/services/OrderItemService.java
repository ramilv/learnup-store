package shop.learnup.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.model.OrderItem;
import shop.learnup.shop.repository.interfaces.OrderItemRepository;

import java.util.Collection;

@Service
public class OrderItemService {
    private OrderItemRepository repository;

    @Autowired
    public OrderItemService(OrderItemRepository repository) {
        this.repository = repository;
    }

    public Collection<OrderItem> getAllOrderItems() {
        return repository.getAllOrderItems();
    }

    public OrderItem get(int id) {
        return repository.getOne(id);
    }

    public OrderItem add(OrderItem orderItem) {
        orderItem.setId(repository.getNewId());
        repository.save(orderItem);
        return orderItem;
    }

    public void delete(int id) {
        repository.delete(id);
    }

    public OrderItem update(OrderItem orderItem) {
        repository.save(orderItem);
        return repository.getOne(orderItem.getId());
    }
}
