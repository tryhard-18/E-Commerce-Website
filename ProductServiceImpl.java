package com.dailycodebuffer.ecommerce.website.service;

import com.dailycodebuffer.ecommerce.website.entity.Product;
import com.dailycodebuffer.ecommerce.website.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepo productRepo;

    @Override
    public Product saveProduct(Product product){
        return productRepo.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepo.findById(id).get();
    }
}
