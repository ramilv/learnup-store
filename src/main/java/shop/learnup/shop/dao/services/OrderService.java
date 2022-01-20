package shop.learnup.shop.dao.services;

import org.springframework.stereotype.Service;
import shop.learnup.shop.model.Order;

@Service
public interface OrderService extends EntityService<Order, Integer> {

}
