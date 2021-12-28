package shop.learnup.shop.dao.services;

import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.Cart;

@Service
public interface CartService extends EntityService<Cart, Integer> {
    Cart getByUser(int userId);
}
