package shop.learnup.shop.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    //void delete(Integer id);

    Item findByName(String name);
}
