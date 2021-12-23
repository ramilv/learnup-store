package shop.learnup.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.OrderItemEntity;
import shop.learnup.shop.repsitory.OrderItemRepository;
import shop.learnup.shop.services.interfaces.OrderItemService;
import java.util.List;

@Service
public class OrderItemImpl implements OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public OrderItemEntity get(Integer id) {
        return orderItemRepository.getById(id);
    }

    @Override
    public OrderItemEntity create(OrderItemEntity order) {
        return orderItemRepository.saveAndFlush(order);
    }

    @Override
    public OrderItemEntity update(OrderItemEntity order) {
        return orderItemRepository.saveAndFlush(order);
    }

    @Override
    public void delete(Integer id) {
        orderItemRepository.deleteById(id);
    }

    @Override
    public List<OrderItemEntity> getAll() {
        return orderItemRepository.findAll();
    }
}
