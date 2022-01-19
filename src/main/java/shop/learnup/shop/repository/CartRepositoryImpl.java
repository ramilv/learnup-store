package shop.learnup.shop.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import shop.learnup.shop.model.Cart;
import shop.learnup.shop.repository.interfaces.CartRepository;

import java.util.*;

@Repository
@Primary
public class CartRepositoryImpl implements CartRepository {

    private final Map<Integer, Cart> carts = new HashMap<>();
    private static final Random RAND = new Random();

    @Override
    public Collection<Cart> getAllCarts() {
        return new ArrayList<>(carts.values());
    }

    @Override
    public Cart getOne(int id) {
        return carts.get(id);
    }

    @Override
    public boolean save(Cart cart) {
        carts.put(cart.getId(), cart);
        return true;
    }

    @Override
    public int getNewId() {
        return RAND.nextInt();
    }

    @Override
    public void delete(int id) {
        carts.remove(id);
    }
}
