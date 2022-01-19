package shop.learnup.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.model.CartItem;
import shop.learnup.shop.repository.interfaces.CartItemRepository;

import java.util.Collection;

@Service
public class CartItemService {
    private CartItemRepository repository;

    @Autowired
    public CartItemService(CartItemRepository repository) {
        this.repository = repository;
    }

    public Collection<CartItem> getAllCartItems() {
        return repository.getAllCartItems();
    }

    public CartItem get(int id) {
        return repository.getOne(id);
    }

    public CartItem add(CartItem cartItem) {
        cartItem.setId(repository.getNewId());
        repository.save(cartItem);
        return cartItem;
    }

    public void delete(int id) {
        repository.delete(id);
    }

    public CartItem update(CartItem cartItem) {
        repository.save(cartItem);
        return repository.getOne(cartItem.getId());
    }
}
