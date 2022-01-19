package shop.learnup.shop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.model.Cart;
import shop.learnup.shop.repository.interfaces.CartRepository;

import java.util.Collection;

@Service
public class CartService {
    private CartRepository repository;

    @Autowired
    public CartService(CartRepository repository) {
        this.repository = repository;
    }

    public Collection<Cart> getAllCarts() {
        return repository.getAllCarts();
    }

    public Cart get(int id) {
        return repository.getOne(id);
    }

    public Cart add(Cart cart) {
        cart.setId(repository.getNewId());
        repository.save(cart);
        return cart;
    }

    public void delete(int id) {
        repository.delete(id);
    }

    public Cart update(Cart cart) {
        repository.save(cart);
        return repository.getOne(cart.getId());
    }
}
