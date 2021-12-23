package shop.learnup.shop.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.entities.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
    //void delete(Integer id);
}
