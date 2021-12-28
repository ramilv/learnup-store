package shop.learnup.shop.dao.services;

import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.Item;

@Service
public interface ItemService extends EntityService<Item, Integer> {
    Item getByName(String name);
}
