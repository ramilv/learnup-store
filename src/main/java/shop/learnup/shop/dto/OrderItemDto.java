package shop.learnup.shop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDto {

    @JsonProperty
    private int id;

    @JsonProperty
    private int orderId;

    @JsonProperty
    private int itemId;

    @JsonProperty
    private int qty;

    @JsonProperty
    private double price;

    @JsonProperty
    private double total;

    @JsonProperty
    private OrderDto order;

}
