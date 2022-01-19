package shop.learnup.shop.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import shop.learnup.shop.model.Item;
import shop.learnup.shop.repository.interfaces.ItemRepository;

import java.util.*;

@Repository
@Primary
public class ItemRepositoryImpl implements ItemRepository {

    private final Map<Integer, Item> items = new HashMap<>();
    private static final Random RAND = new Random();

    @Override
    public Collection<Item> getAllItems() {
        return new ArrayList<>(items.values());
    }

    @Override
    public Item getOne(int id) {
        return items.get(id);
    }

    @Override
    public boolean save(Item item) {
        items.put(item.getId(), item);
        return true;
    }

    @Override
    public int getNewId() {
        return RAND.nextInt();
    }

    @Override
    public void delete(int id) {
        items.remove(id);
    }
}
