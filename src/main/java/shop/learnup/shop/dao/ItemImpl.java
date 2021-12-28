package shop.learnup.shop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.Item;
import shop.learnup.shop.repsitory.ItemRepository;
import shop.learnup.shop.dao.services.ItemService;

import java.util.List;

@Service
public class ItemImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item get(Integer id) {
        return itemRepository.getById(id);
    }

    @Override
    public Item create(Item item) {
        return itemRepository.saveAndFlush(item);
    }

    @Override
    public Item update(Item item) {
        return itemRepository.saveAndFlush(item);
    }

    @Override
    public void delete(Integer id) {
        itemRepository.deleteById(id);
    }

    @Override
    public Item getByName(String name) {
        return itemRepository.findByName(name);
    }

    @Override
    public List<Item> getAll() {
        return itemRepository.findAll();
    }
}
