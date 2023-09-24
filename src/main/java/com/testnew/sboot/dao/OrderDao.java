package com.testnew.sboot.dao;

import com.testnew.sboot.model.Order;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {
    public List<Order> getOrders() {
        return Stream.of(
                new Order(1, 10, "mobile", 2000),
                new Order(2, 20, "Book", 500),
                new Order(3, 3, "Laptop", 5000)
        ).collect(Collectors.toList());
    }
}
