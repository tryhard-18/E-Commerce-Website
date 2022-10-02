package com.dailycodebuffer.ecommerce.website.controller;

import com.dailycodebuffer.ecommerce.website.entity.*;
import com.dailycodebuffer.ecommerce.website.service.ConcernsService;
import com.dailycodebuffer.ecommerce.website.service.OrderService;
import com.dailycodebuffer.ecommerce.website.service.SignUpService;
import com.dailycodebuffer.ecommerce.website.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Controller
//public class ECommerceController {
//
//    @GetMapping("/")
//    public String func(){
//        return "index";
//    }
//
//    @GetMapping("/buy")
//    public String buyGet(){
//        return "buy";
//    }
//
//    @PostMapping("/buy")
//    public String buyPost(){
//        return "OTP";
//    }
//
//    @PostMapping("/OTP")
//    public String orderSaved(){
//        return "orderSaved";
//    }
//
//    @GetMapping("/contact")
//    public String contact(){
//        return "contact";
//    }
//
//    @PostMapping("/contact")
//    public String contactSaved(){
//        return "contactSaved";
//    }
//
//}



@Controller
public class ECommerceController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/")
    public String func(){
        return "index";
    }

    @GetMapping("/{sno}")
    public String personHonePage(@PathVariable("sno") Long sno, Model model){
        model.addAttribute("sno", sno);
        SignUp signUp = signUpService.findById(sno);
        model.addAttribute("email", signUp.getEmail());
        return "indexWithSno";
    }

}
