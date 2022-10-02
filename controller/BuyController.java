package com.dailycodebuffer.ecommerce.website.controller;

import com.dailycodebuffer.ecommerce.website.entity.Order;
import com.dailycodebuffer.ecommerce.website.entity.SignUp;
import com.dailycodebuffer.ecommerce.website.entity.UserCart;
import com.dailycodebuffer.ecommerce.website.service.OrderService;
import com.dailycodebuffer.ecommerce.website.service.SignUpService;
import com.dailycodebuffer.ecommerce.website.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BuyController {

    @Autowired
    private UserCartService userCartService;

    @Autowired
    private OrderService orderService;

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/buy/{sno}")
    public String buyGet(@PathVariable("sno") Long sno, Model model){
        model.addAttribute("sno", sno);
        return "buyWithSno";
    }

    @PostMapping("/buy/{sno}")
    public String buyPost(@PathVariable("sno") Long sno, Model model){
        model.addAttribute("sno", sno);
        return "OTPWithSno";
    }

    @PostMapping("/OTP/{sno}")
    public String orderSaved(@PathVariable("sno") Long sno, Model model){
        List<UserCart> carts = userCartService.findByUserId(sno);
        SignUp signUp = signUpService.findById(sno);
        for(UserCart cart:carts){
            Order order = Order.builder()
                    .userId(cart.getUserId())
                    .title(cart.getTitle())
                    .price(cart.getPrice())
                    .email(signUp.getEmail())
                    .build();
            orderService.save(order);
        }
        ArrayList<Long> list_snos = new ArrayList<>();
        for(UserCart cart:carts){
            list_snos.add(cart.getUserSno());
        }
        for(Long el:list_snos){
            userCartService.deleteItemById(el);
        }
        model.addAttribute("sno", sno);
        return "orderSavedWithSno";
    }

    @GetMapping("/failed/{sno}")
    public String orderFailed(@PathVariable("sno") Long sno){
        return "redirect:/cart/"+sno;
    }
}
