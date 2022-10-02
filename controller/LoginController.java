package com.dailycodebuffer.ecommerce.website.controller;

import com.dailycodebuffer.ecommerce.website.entity.Login;
import com.dailycodebuffer.ecommerce.website.entity.SignUp;
import com.dailycodebuffer.ecommerce.website.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

//@Controller
//public class LoginController {
//
//    @Autowired
//    private SignUpService signUpService;
//
//    @PostMapping("/login")
//    public String checkLogin(Login login, Model model){    //Don' use '@RequestBody' annotation with 'login' parameter here.
//        try {
//            signUpService.checkLogin(login);
//        }
//        catch (Exception e){
//            model.addAttribute("message", e.toString());
//            return "loginSignUpUnsuccessful";
//        }
//        return "redirect:/";
//    }
//}


@Controller
public class LoginController {

    @Autowired
    private SignUpService signUpService;

    @PostMapping("/login")
    public String checkLogin(Login login, Model model){    //Don' use '@RequestBody' annotation with 'login' parameter here.
        try {
            signUpService.checkLogin(login);
        }
        catch (Exception e){
            model.addAttribute("message", e.toString());
            return "loginSignUpUnsuccessful";
        }
        String email = login.getEmail();
        SignUp signUp = signUpService.findByEmail(email);
        Long sno = signUp.getSno();

        return "redirect:/" + sno;
    }
}

