package shop.learnup.shop.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import shop.learnup.shop.dao.services.ItemService;
import shop.learnup.shop.dto.ItemDto;
import shop.learnup.shop.mappers.interfaces.ItemMapper;
import shop.learnup.shop.model.Item;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {

    private final ItemService service;
    private final ItemMapper itemMapper;

    @Autowired
    public ItemController(ItemService service, ItemMapper itemMapper) {
        this.service = service;
        this.itemMapper = itemMapper;
    }

    @GetMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection<ItemDto> getAllItems() {
        final Collection<Item> allItems = service.getAll();
        final List<ItemDto> result = new ArrayList<>(allItems.size());
        for (Item item : allItems) {
            result.add(itemMapper.toDto(item));
        }
        return result;
    }

    @GetMapping(
            value = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ItemDto getItem(@PathVariable("id") int id) {
        return itemMapper.toDto(
                service.get(id));
    }

    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ItemDto addItem(@RequestBody ItemDto itemDto) {
        return itemMapper.toDto(
                service.create(
                        itemMapper.toModel(itemDto)));
    }

    @PutMapping(
            value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ItemDto updateItem(@PathVariable int id, @RequestBody ItemDto itemDto) {
        return itemMapper.toDto(
                service.update(
                        itemMapper.toModel(itemDto)));
    }

    @DeleteMapping(
            value = "/{id}")
    public void delete(@PathVariable("id") int id) {
        service.delete(id);
    }
}
