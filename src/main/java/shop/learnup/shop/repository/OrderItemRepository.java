package shop.learnup.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{

}
