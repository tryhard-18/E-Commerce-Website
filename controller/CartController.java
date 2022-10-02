package com.dailycodebuffer.ecommerce.website.controller;

import com.dailycodebuffer.ecommerce.website.entity.Cart;
import com.dailycodebuffer.ecommerce.website.entity.UserCart;
import com.dailycodebuffer.ecommerce.website.service.CartService;
import com.dailycodebuffer.ecommerce.website.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//@Controller
//public class CartController {
//
//    @Autowired
//    private CartService cartService;
//
//    @GetMapping("/cart")
//    public String gtCart(Model model){
//        List<Cart> carts = cartService.getAllCart();
//        Long sum = carts.stream().mapToLong(Cart::getPrice).sum();
//        model.addAttribute("cartStats", carts);
//        model.addAttribute("totalPrice", sum);
//        return "cart";
//    }
//
//    @GetMapping("/delete/{sno}")
//    public String deleteItemById(@PathVariable("sno") Long sno){
//        cartService.deleteItemById(sno);
//        return "redirect:/cart";
//    }
//}



@Controller
public class CartController {

    @Autowired
    private UserCartService userCartService;

    @GetMapping("/cart/{sno}")
    public String gtCart(@PathVariable("sno") Long sno, Model model){
        List<UserCart> carts = userCartService.findByUserId(sno);
        Long sum = carts.stream().mapToLong(UserCart::getPrice).sum();
        model.addAttribute("sno", sno);
        model.addAttribute("cartStats", carts);
        model.addAttribute("totalPrice", sum);
        return "cart";
    }

    @GetMapping("/delete/{sno}")
    public String deleteItemById(@PathVariable("sno") Long sno){
        UserCart userCart = userCartService.findById(sno);
        userCartService.deleteItemById(sno);
        return "redirect:/cart/"+userCart.getUserId();
    }
}
