package shop.learnup.shop.repository.interfaces;

import shop.learnup.shop.model.Cart;

import java.util.Collection;

public interface CartRepository {

    Collection<Cart> getAllCarts();

    Cart getOne(int id);

    boolean save(Cart cart);

    int getNewId();

    void delete(int id);
}
