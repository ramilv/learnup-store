package shop.learnup.shop.services;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.learnup.shop.entities.CartEntity;
import shop.learnup.shop.repsitory.CartRepository;
import shop.learnup.shop.services.interfaces.CartService;

import java.util.List;

@Service
public class CartImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public CartEntity get(Integer id) {
        return cartRepository.getById(id);
    }

    @Override
    public CartEntity create(CartEntity cart) {
        CartEntity existsCart = cartRepository.findOneByItemId(cart.getItemId());
        if (existsCart != null) {
            existsCart.setQty(existsCart.getQty() + cart.getQty());
            return cartRepository.saveAndFlush(existsCart);
        }
        return cartRepository.saveAndFlush(cart);
    }

    @Override
    public CartEntity update(CartEntity cart) {
        return cartRepository.saveAndFlush(cart);
    }

    @Override
    public void delete(Integer id) {
        cartRepository.deleteById(id);
    }

    @Override
    public List<CartEntity> getAll() {
        return cartRepository.findAll();
    }
}
