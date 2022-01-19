package shop.learnup.shop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    @JsonProperty
    private int id;

    @JsonProperty
    private Date date;

    @JsonProperty
    private int userId;

    @JsonProperty
    private List<OrderItemDto> orderItems;
}
