package com.dailycodebuffer.ecommerce.website.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userSno;

    private Long userId;
    private String title;
    private Long price;
}
