package com.testnew.sboot.service;

import com.testnew.sboot.dao.OrderDao;
import com.testnew.sboot.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public List<Order> getOrders() {
        return orderDao.getOrders();
    }
}
