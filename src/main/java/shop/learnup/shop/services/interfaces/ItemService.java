package shop.learnup.shop.services.interfaces;

import shop.learnup.shop.entities.ItemEntity;

public interface ItemService extends EntityService<ItemEntity, Integer> {
    ItemEntity getByName(String name);
}
