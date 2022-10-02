package com.dailycodebuffer.ecommerce.website.service;

import com.dailycodebuffer.ecommerce.website.entity.Order;
import com.dailycodebuffer.ecommerce.website.entity.UserCart;

import java.util.List;

public interface OrderService {

    void save(Order order);

    List<Order> findByUserId(Long sno);
}
