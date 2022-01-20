package shop.learnup.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shop.learnup.shop.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    //void delete(Integer id);

    Item findByName(String name);
}
