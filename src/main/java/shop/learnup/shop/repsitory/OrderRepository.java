package shop.learnup.shop.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    //void delete(Integer id);
}
