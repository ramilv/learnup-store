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
}
