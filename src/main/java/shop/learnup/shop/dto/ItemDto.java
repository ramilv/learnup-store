package shop.learnup.shop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {

    @JsonProperty
    private Integer id;

    @JsonProperty
    private String name;

    @JsonProperty
    private Double price;

    @JsonProperty
    private int available;

    @JsonProperty
    private CartItemDto cartItem;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getAvailable() {
        return available;
    }

    public CartItemDto getCartItem() {
        return cartItem;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public void setCartItem(CartItemDto cartItem) {
        this.cartItem = cartItem;
    }
}
