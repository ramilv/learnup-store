package shop.learnup.shop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.dao.services.CartService;
import shop.learnup.shop.model.Cart;
import shop.learnup.shop.repository.CartRepository;

import java.util.List;

@Service
public class CartImpl implements CartService {

    private final CartRepository cartRepository;

    @Autowired
    public CartImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart get(Integer id) {
        return cartRepository.getById(id);
    }

    @Override
    public Cart create(Cart cart) {
        return cartRepository.saveAndFlush(cart);
    }

    @Override
    public Cart update(Cart cart) {
        return cartRepository.saveAndFlush(cart);
    }

    @Override
    public void delete(Integer id) {
        cartRepository.deleteById(id);
    }

    @Override
    public List<Cart> getAll() {
        return cartRepository.findAll();
    }

    @Override
    public Cart getByUser(int userId) {
        return cartRepository.findCartByUserId(userId);
    }
}
