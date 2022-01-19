package shop.learnup.shop.repository;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import shop.learnup.shop.model.CartItem;
import shop.learnup.shop.repository.interfaces.CartItemRepository;

import java.util.*;

@Repository
@Primary
public class CartItemRepositoryImpl implements CartItemRepository {

    private final Map<Integer, CartItem> cartItems = new HashMap<>();
    private static final Random RAND = new Random();

    @Override
    public Collection<CartItem> getAllCartItems() {
        return new ArrayList<>(cartItems.values());
    }

    @Override
    public CartItem getOne(int id) {
        return cartItems.get(id);
    }

    @Override
    public boolean save(CartItem cartItem) {
        cartItems.put(cartItem.getId(), cartItem);
        return true;
    }

    @Override
    public int getNewId() {
        return RAND.nextInt();
    }

    @Override
    public void delete(int id) {
        cartItems.remove(id);
    }
}
