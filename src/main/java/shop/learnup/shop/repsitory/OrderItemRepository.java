package shop.learnup.shop.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.entities.OrderItemEntity;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Integer>{
    //void delete(Integer id);
}
