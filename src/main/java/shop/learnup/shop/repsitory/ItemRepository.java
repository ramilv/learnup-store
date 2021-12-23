package shop.learnup.shop.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.entities.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {

    //void delete(Integer id);

    ItemEntity findByName(String name);
}
