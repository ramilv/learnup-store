package shop.learnup.shop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.CartItem;
import shop.learnup.shop.entities.Order;
import shop.learnup.shop.entities.OrderItem;
import shop.learnup.shop.repsitory.OrderItemRepository;
import shop.learnup.shop.repsitory.OrderRepository;
import shop.learnup.shop.dao.services.OrderService;

import java.util.Date;
import java.util.List;

@Service
public class OrderImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    @Autowired
    public OrderImpl(OrderRepository orderRepository, OrderItemRepository orderItemRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
    }

    @Override
    public Order get(Integer id) {
        return orderRepository.getById(id);
    }

    @Override
    public Order create(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public Order update(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }
}
