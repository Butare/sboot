package com.testnew.sboot;

import com.testnew.sboot.model.Order;
import com.testnew.sboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getOrder() {
        return orderService.getOrders()
                .stream().sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
    }
}
