package com.dailycodebuffer.ecommerce.website.service;

import com.dailycodebuffer.ecommerce.website.entity.Login;
import com.dailycodebuffer.ecommerce.website.entity.SignUp;
import com.dailycodebuffer.ecommerce.website.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements  SignUpService{

    @Autowired
    private SignUpRepository signUpRepository;

    @Override
    public void saveSignUp(SignUp signUp) throws Exception {
        if(!signUp.getConfirmPassword().equals(signUp.getPassword())){
            throw new Exception("Password doesnt match");
        }
        SignUp checkSignUp = signUpRepository.findByEmail(signUp.getEmail());
        if(checkSignUp==null) {
            signUpRepository.save(signUp);
        }
        else{
            throw new Exception("Email already exits");
        }
    }

    @Override
    public void checkLogin(Login login) throws Exception {
        SignUp chkLogin = signUpRepository.findByEmail(login.getEmail());
        if(chkLogin==null){
            throw new Exception("Need SignUp");
        }
        else if(!chkLogin.getPassword().equals(login.getPassword())){
            throw new Exception("Password is wrong");
        }
    }

    @Override
    public SignUp findByEmail(String email) {
        return signUpRepository.findByEmail(email);
    }

    @Override
    public SignUp findById(Long sno) {
        return signUpRepository.findById(sno).get();
    }


}
