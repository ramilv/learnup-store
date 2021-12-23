package shop.learnup.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.ItemEntity;
import shop.learnup.shop.repsitory.ItemRepository;
import shop.learnup.shop.services.interfaces.ItemService;
import java.util.List;

@Service
public class ItemImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public ItemEntity get(Integer id) {
        return itemRepository.getById(id);
    }

    @Override
    public ItemEntity create(ItemEntity item) {
        return itemRepository.saveAndFlush(item);
    }

    @Override
    public ItemEntity update(ItemEntity item) {
        return itemRepository.saveAndFlush(item);
    }

    @Override
    public void delete(Integer id) {
        itemRepository.deleteById(id);
    }

    @Override
    public ItemEntity getByName(String name) {
        return itemRepository.findByName(name);
    }

    @Override
    public List<ItemEntity> getAll() {
        return itemRepository.findAll();
    }
}
