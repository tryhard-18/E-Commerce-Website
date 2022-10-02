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
import org.springframework.web.bind.annotation.PostMapping;

//@Controller
//public class ProductDetailsController {
//
//    @Autowired
//    private CartService cartService;
//
//    @GetMapping("/productdetails")
//    public String productDetails(){
//        return "productDetails";
//    }
//
//    @PostMapping("/productdetails")
//    public String saveProduct(){
//        Cart cart = Cart.builder()
//                .title("Color Block Men Round Neck Black T-Shirt")
//                .price(499L)
//                .build();
//        cartService.saveProduct(cart);
//        return "redirect:/cart";
//    }
//}



@Controller
public class ProductDetailsController {

//    @Autowired
//    private CartService cartService;

    @Autowired
    private UserCartService userCartService;

    @GetMapping("/productdetails/{sno}")
    public String productDetails(@PathVariable("sno") Long sno, Model model){
        model.addAttribute("sno",sno);
        return "productDetailsWithSno";
    }

    @PostMapping("/productdetails/{sno}")
    public String saveProduct(@PathVariable("sno") Long sno){
        UserCart cart = UserCart.builder()
                .userId(sno)
                .title("Color Block Men Round Neck Black T-Shirt")
                .price(499L)
                .build();

        userCartService.saveProduct(cart);
        return "redirect:/cart/"+sno;
    }
}
