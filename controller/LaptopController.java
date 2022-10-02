package com.dailycodebuffer.ecommerce.website.controller;

import com.dailycodebuffer.ecommerce.website.entity.Cart;
import com.dailycodebuffer.ecommerce.website.entity.Product;
import com.dailycodebuffer.ecommerce.website.entity.UserCart;
import com.dailycodebuffer.ecommerce.website.service.CartService;
import com.dailycodebuffer.ecommerce.website.service.ProductService;
import com.dailycodebuffer.ecommerce.website.service.UserCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//@Controller
//public class LaptopController {
//
//    @Autowired
//    private CartService cartService;
//
//    @GetMapping("/acer")
//    public String acer(){
//        return "acerLaptops";
//    }
//
//    @GetMapping("/acerpredator")
//    public String acerPredatorGet(){
//        return "predator";
//    }
//
//    @PostMapping("/acerpredator")
//    public String savePredator(){
//        Cart cart = Cart.builder()
//                .title("Acer Predator Helios 300 Core i7 10th Gen - (16 GB/1 TB HDD/256 GB SSD/Windows 10 Home/6 GB Graphics/N...")
//                .price(67499L)
//                .build();
//        cartService.savePredator(cart);
//        return "redirect:/cart";
//        return "acerLaptops";



@Controller
public class LaptopController {

    @Autowired
    private UserCartService userCartService;

    @Autowired
    private ProductService productService;

    @GetMapping("/acer/{sno}")
    public String acer(@PathVariable("sno") Long sno, Model model){
        model.addAttribute("sno", sno);
        return "acerLaptopsWithSno";
    }

    @GetMapping("/acerpredator/{sno}")
    public String acerPredatorGet(@PathVariable("sno") Long sno, Model model){
        model.addAttribute("sno",sno);
        return "predatorWithSno";
    }

    @GetMapping("/acerpredator/{sno}/{id}")
    public String acerPredatorGetWithId(@PathVariable("sno")  Long sno, @PathVariable("id") Long id, Model model){
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        model.addAttribute("sno",sno);
        return "predatorWithSno";
    }

    @PostMapping("/acerpredator/{sno}")
    public String savePredator(@PathVariable("sno") Long sno){
        UserCart cart = UserCart.builder()
                .userId(sno)
                .title("Acer Predator Helios 300 Core i7 10th Gen - (16 GB/1 TB HDD/256 GB SSD/Windows 10 Home/6 GB Graphics/N...")
                .price(67499L)
                .build();
        userCartService.savePredator(cart);
        return "redirect:/cart/"+sno;


    }
}
