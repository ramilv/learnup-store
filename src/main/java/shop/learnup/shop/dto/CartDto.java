package shop.learnup.shop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {

    @JsonProperty
    private int id;

    @JsonProperty
    private int userId;

    @JsonProperty
    private List<CartItemDto> cartItems;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public List<CartItemDto> getCartItems() {
        return cartItems;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setCartItems(List<CartItemDto> cartItems) {
        this.cartItems = cartItems;
    }
}
