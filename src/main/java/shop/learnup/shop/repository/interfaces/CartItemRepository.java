package shop.learnup.shop.repository.interfaces;

import shop.learnup.shop.model.CartItem;

import java.util.Collection;

public interface CartItemRepository {

    Collection<CartItem> getAllCartItems();

    CartItem getOne(int id);

    boolean save(CartItem cartItem);

    int getNewId();

    void delete(int id);
}
