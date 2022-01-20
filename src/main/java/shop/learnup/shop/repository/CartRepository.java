package shop.learnup.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    Cart findCartByUserId(int userId);
}
