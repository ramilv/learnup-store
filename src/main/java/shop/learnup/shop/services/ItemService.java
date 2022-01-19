package shop.learnup.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.model.Item;
import shop.learnup.shop.repository.interfaces.ItemRepository;

import java.util.Collection;

@Service
public class ItemService {
    private ItemRepository repository;

    @Autowired
    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public Collection<Item> getAllItems() {
        return repository.getAllItems();
    }

    public Item get(int id) {
        return repository.getOne(id);
    }

    public Item add(Item item) {
        item.setId(repository.getNewId());
        repository.save(item);
        return item;
    }

    public void delete(int id) {
        repository.delete(id);
    }

    public Item update(Item item) {
        repository.save(item);
        return repository.getOne(item.getId());
    }
}
