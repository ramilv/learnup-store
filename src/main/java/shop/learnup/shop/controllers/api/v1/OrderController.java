package shop.learnup.shop.controllers.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import shop.learnup.shop.dto.OrderDto;
import shop.learnup.shop.mappers.interfaces.OrderItemMapper;
import shop.learnup.shop.mappers.interfaces.OrderMapper;
import shop.learnup.shop.model.Order;
import shop.learnup.shop.services.OrderItemService;
import shop.learnup.shop.services.OrderService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    private final OrderService orderService;
    private final OrderItemService orderItemService;
    private final OrderMapper orderMapper;
    private final OrderItemMapper orderItemMapper;

    @Autowired
    public OrderController(OrderService orderService, OrderItemService orderItemService, OrderMapper orderMapper, OrderItemMapper orderItemMapper) {
        this.orderService = orderService;
        this.orderItemService = orderItemService;
        this.orderMapper = orderMapper;
        this.orderItemMapper = orderItemMapper;
    }

    @GetMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection<OrderDto> getAllOrders() {
        final Collection<Order> allOrders = orderService.getAllOrders();
        final List<OrderDto> result = new ArrayList<>(allOrders.size());
        for (Order order : allOrders) {
            result.add(orderMapper.toDto(order));
        }
        return result;
    }

    @GetMapping(
            value = "/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderDto getOrder(@PathVariable("id") int id) {
        return orderMapper.toDto(
                orderService.get(id));
    }

    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderDto addOrder(@RequestBody OrderDto orderDto) {
        return orderMapper.toDto(
                orderService.add(
                        orderMapper.toModel(orderDto)));
    }

    @PutMapping(
            value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderDto updateOrder(@PathVariable int id, @RequestBody OrderDto orderDto) {
        orderDto.setId(id);
        return orderMapper.toDto(
                orderService.update(
                        orderMapper.toModel(orderDto)));
    }

    @DeleteMapping(
            value = "/{id}")
    public void delete(@PathVariable("id") int id) {
        orderService.delete(id);
    }
}
