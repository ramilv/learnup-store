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

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getUserId() {
        return userId;
    }

    public List<OrderItemDto> getOrderItems() {
        return orderItems;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setOrderItems(List<OrderItemDto> orderItems) {
        this.orderItems = orderItems;
    }
}
