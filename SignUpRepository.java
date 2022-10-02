package com.dailycodebuffer.ecommerce.website.repository;

import com.dailycodebuffer.ecommerce.website.entity.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SignUpRepository extends JpaRepository<SignUp, Long> {
    SignUp findByEmail(String email);
}
