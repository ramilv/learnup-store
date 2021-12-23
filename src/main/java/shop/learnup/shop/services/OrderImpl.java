package shop.learnup.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.CartEntity;
import shop.learnup.shop.entities.OrderEntity;
import shop.learnup.shop.entities.OrderItemEntity;
import shop.learnup.shop.repsitory.CartRepository;
import shop.learnup.shop.repsitory.OrderRepository;
import shop.learnup.shop.services.interfaces.OrderService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderEntity get(Integer id) {
        return orderRepository.getById(id);
    }

    @Override
    public OrderEntity create(OrderEntity item) {
        return orderRepository.saveAndFlush(item);
    }

    @Override
    public OrderEntity update(OrderEntity order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public List<OrderEntity> getAll() {
        return orderRepository.findAll();
    }
}
