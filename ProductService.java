package com.dailycodebuffer.ecommerce.website.service;

import com.dailycodebuffer.ecommerce.website.entity.Product;

public interface ProductService {
    public Product saveProduct(Product product);

    Product getProductById(Long id);
}
