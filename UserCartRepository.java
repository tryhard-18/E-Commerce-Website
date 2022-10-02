package com.dailycodebuffer.ecommerce.website.repository;

import com.dailycodebuffer.ecommerce.website.entity.UserCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserCartRepository extends JpaRepository<UserCart, Long> {
    List<UserCart> findByUserId(Long sno);

}
