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
//public class MobileController {
//
//    @Autowired
//    private CartService cartService;
//
//    @GetMapping("/real")
//    public String realMe(){
//        return "realmeMobiles";
//    }
//
//    @GetMapping("/realme7i")
//    public String realme7i(){
//        return "realme7i";
//    }
//
//    @PostMapping("/realme7i")
//    public String saveRealMe7i(){
//        Cart cart = Cart.builder()
//                .title("Realme 7i (Fusion Green, 64 GB)")
//                .price(7499L)
//                .build();
//        cartService.saveRealMe7i(cart);
//        return "redirect:/cart";
//    }
//}


@Controller
public class MobileController {

    @Autowired
    private UserCartService userCartService;

    @GetMapping("/real/{sno}")
    public String realMe(@PathVariable("sno") Long sno, Model model){
        model.addAttribute("sno", sno);
        return "realmeMobilesWithSno";
    }

    @GetMapping("/realme7i/{sno}")
    public String realme7i(@PathVariable("sno") Long sno, Model model){
        model.addAttribute("sno", sno);
        return "realme7iWithSno";
    }

    @PostMapping("/realme7i/{sno}")
    public String saveRealMe7i(@PathVariable("sno") Long sno){
        UserCart cart = UserCart.builder()
                .userId(sno)
                .title("Realme 7i (Fusion Green, 64 GB)")
                .price(7499L)
                .build();
        userCartService.saveRealMe7i(cart);
        return "redirect:/cart/"+sno;
    }
}
