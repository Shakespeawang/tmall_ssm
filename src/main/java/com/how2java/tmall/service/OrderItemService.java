package com.how2java.tmall.service;

import com.how2java.tmall.pojo.Order;
import com.how2java.tmall.pojo.OrderItem;

import java.util.List;

public interface OrderItemService {
    void add(OrderItem o);

    void delete(int id);

    void update(OrderItem o);

    OrderItem get(int id);

    List list();

    void fill(List<Order> os);

    void fill(Order order);
}
