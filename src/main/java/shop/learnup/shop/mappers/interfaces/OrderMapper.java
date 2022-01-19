package shop.learnup.shop.mappers.interfaces;

import org.mapstruct.Mapper;
import shop.learnup.shop.dto.OrderDto;
import shop.learnup.shop.model.Order;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(Order source);
    Order toModel(OrderDto dto);
}
