package com.dailycodebuffer.ecommerce.website.repository;

import com.dailycodebuffer.ecommerce.website.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

}
