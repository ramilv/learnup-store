package shop.learnup.shop.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
    Cart findCartByUserId(int userId);
}
