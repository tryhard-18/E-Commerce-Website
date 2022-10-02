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
public class SignUp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sno;

    private String name;
    private String email;
    private String password;
    private String confirmPassword;

}
