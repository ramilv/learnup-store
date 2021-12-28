package shop.learnup.shop.dao.services;

import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.OrderItem;

@Service
public interface OrderItemService extends EntityService<OrderItem, Integer> {
}
