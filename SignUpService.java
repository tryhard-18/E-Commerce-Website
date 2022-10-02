package com.dailycodebuffer.ecommerce.website.service;

import com.dailycodebuffer.ecommerce.website.entity.Login;
import com.dailycodebuffer.ecommerce.website.entity.SignUp;

public interface SignUpService {
    void saveSignUp(SignUp signUp) throws Exception;


    void checkLogin(Login login) throws Exception;

    SignUp findByEmail(String email);

    SignUp findById(Long sno);
}
