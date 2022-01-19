package shop.learnup.shop.repository.interfaces;

import shop.learnup.shop.model.Item;

import java.util.Collection;

public interface ItemRepository {

    Collection<Item> getAllItems();

    Item getOne(int id);

    boolean save(Item Item);

    int getNewId();

    void delete(int id);
}
