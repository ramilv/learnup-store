package shop.learnup.shop.mappers.interfaces;

import org.mapstruct.Mapper;
import shop.learnup.shop.dto.OrderItemDto;
import shop.learnup.shop.model.OrderItem;

@Mapper(componentModel = "spring")
public interface OrderItemMapper {
    OrderItemDto toDto(OrderItem source);
    OrderItem toModel(OrderItemDto dto);
}
