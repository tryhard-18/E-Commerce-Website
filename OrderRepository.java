package com.dailycodebuffer.ecommerce.website.repository;

import com.dailycodebuffer.ecommerce.website.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long sno);
}
