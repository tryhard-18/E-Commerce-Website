package com.dailycodebuffer.ecommerce.website.controller;

import com.dailycodebuffer.ecommerce.website.entity.SignUp;
import com.dailycodebuffer.ecommerce.website.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @PostMapping("/signUp")
    public String saveSignUp(SignUp signUp, Model model){    //Don' use '@RequestBody' annotation with 'signUp' parameter here.
        try {
            signUpService.saveSignUp(signUp);
        }
        catch (Exception e){
            model.addAttribute("message", e.toString());
            return "loginSignUpUnsuccessful";
        }
        return "signUpSuccessful";
    }
}
