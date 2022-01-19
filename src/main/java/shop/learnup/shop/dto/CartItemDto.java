package shop.learnup.shop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemDto {

    @JsonProperty
    private int id;

    @JsonProperty
    private int itemId;

    @JsonProperty
    private int qty;

    @JsonProperty
    private double price;

    @JsonProperty
    private int cartId;

    @JsonProperty
    private CartDto cart;

    @JsonProperty
    private ItemDto item;

}
