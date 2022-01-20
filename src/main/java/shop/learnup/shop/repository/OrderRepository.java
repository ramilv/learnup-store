package shop.learnup.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
    //void delete(Integer id);
}
