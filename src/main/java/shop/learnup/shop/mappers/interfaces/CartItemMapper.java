package shop.learnup.shop.mappers.interfaces;

import org.mapstruct.Mapper;
import shop.learnup.shop.dto.CartItemDto;
import shop.learnup.shop.model.CartItem;

@Mapper(componentModel = "spring")
public interface CartItemMapper {
    CartItemDto toDto(CartItem source);
    CartItem toModel(CartItemDto dto);
}
