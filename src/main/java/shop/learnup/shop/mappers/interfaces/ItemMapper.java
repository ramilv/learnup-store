package shop.learnup.shop.mappers.interfaces;

import org.mapstruct.Mapper;
import shop.learnup.shop.dto.ItemDto;
import shop.learnup.shop.model.Item;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemDto toDto(Item source);
    Item toModel(ItemDto dto);
}
