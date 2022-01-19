package shop.learnup.shop.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import shop.learnup.shop.dto.CartDto;
import shop.learnup.shop.mappers.interfaces.CartItemMapper;
import shop.learnup.shop.mappers.interfaces.CartMapper;
import shop.learnup.shop.model.Cart;
import shop.learnup.shop.services.CartItemService;
import shop.learnup.shop.services.CartService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {

    private final CartService cartService;
    private final CartItemService cartItemService;
    private final CartMapper cartMapper;
    private final CartItemMapper cartItemMapper;

    @Autowired
    public CartController(CartService cartService, CartItemService cartItemService, CartMapper cartMapper, CartItemMapper cartItemMapper) {
        this.cartService = cartService;
        this.cartItemService = cartItemService;
        this.cartMapper = cartMapper;
        this.cartItemMapper = cartItemMapper;
    }

    @GetMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection<CartDto> getAllCarts() {
        final Collection<Cart> allCarts = cartService.getAllCarts();
        final List<CartDto> result = new ArrayList<>(allCarts.size());
        for (Cart cart : allCarts) {
            result.add(cartMapper.toDto(cart));
        }
        return result;
    }

    @GetMapping(
            value = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public CartDto getCart(@PathVariable("id") int id) {
        return cartMapper.toDto(
                cartService.get(id));
    }

    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public CartDto addCart(@RequestBody CartDto cartDto) {
        return cartMapper.toDto(
                cartService.add(
                        cartMapper.toModel(cartDto)));
    }

    @PutMapping(
            value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public CartDto updateCart(@PathVariable int id, @RequestBody CartDto cartDto) {
        cartDto.setId(id);
        return cartMapper.toDto(
                cartService.update(
                        cartMapper.toModel(cartDto)));
    }

    @DeleteMapping(
            value = "/{id}")
    public void delete(@PathVariable("id") int id) {
        cartService.delete(id);
    }
}
