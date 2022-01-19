package shop.learnup.shop.mappers.interfaces;

import org.mapstruct.Mapper;
import shop.learnup.shop.dto.CartDto;
import shop.learnup.shop.model.Cart;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(Cart source);
    Cart toModel(CartDto dto);
}
