package shop.learnup.shop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.dao.services.OrderItemService;
import shop.learnup.shop.model.OrderItem;
import shop.learnup.shop.repository.OrderItemRepository;

import java.util.List;

@Service
public class OrderItemImpl implements OrderItemService {

    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemImpl(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public OrderItem get(Integer id) {
        return orderItemRepository.getById(id);
    }

    @Override
    public OrderItem create(OrderItem order) {
        return orderItemRepository.saveAndFlush(order);
    }

    @Override
    public OrderItem update(OrderItem order) {
        return orderItemRepository.saveAndFlush(order);
    }

    @Override
    public void delete(Integer id) {
        orderItemRepository.deleteById(id);
    }

    @Override
    public List<OrderItem> getAll() {
        return orderItemRepository.findAll();
    }
}
