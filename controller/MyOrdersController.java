package com.dailycodebuffer.ecommerce.website.controller;

import com.dailycodebuffer.ecommerce.website.entity.Order;
import com.dailycodebuffer.ecommerce.website.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class MyOrdersController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/myOrders/{sno}")
    public String showOrders(@PathVariable("sno") Long sno, Model model){
        List<Order> orders = orderService.findByUserId(sno);
        model.addAttribute("sno", sno);
        model.addAttribute("orderStats", orders);
        return "myOrders";
    }
}
