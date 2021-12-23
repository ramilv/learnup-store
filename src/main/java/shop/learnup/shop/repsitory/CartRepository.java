package shop.learnup.shop.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.entities.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity, Integer> {
    CartEntity findOneByItemId(int itemId);

    //void delete(Integer id);
}
