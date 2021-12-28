package shop.learnup.shop.dao.services;

import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.CartItem;
import shop.learnup.shop.entities.Order;
import java.util.List;

@Service
public interface OrderService extends EntityService<Order, Integer> {

}
