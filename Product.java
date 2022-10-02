package com.dailycodebuffer.ecommerce.website.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private Long id;

    private String productType;
    private String ram;
    private String processor;
    private String memory;
    private String graphics;
    private String price;
}
