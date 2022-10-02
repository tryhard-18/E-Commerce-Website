package com.dailycodebuffer.ecommerce.website.controller;

import com.dailycodebuffer.ecommerce.website.entity.Concerns;
import com.dailycodebuffer.ecommerce.website.entity.Contact;
import com.dailycodebuffer.ecommerce.website.entity.SignUp;
import com.dailycodebuffer.ecommerce.website.service.ConcernsService;
import com.dailycodebuffer.ecommerce.website.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    private SignUpService signUpService;

    @Autowired
    private ConcernsService concernsService;

    @GetMapping("/contact/{sno}")
    public String contact(@PathVariable("sno") Long sno, Model model){
        model.addAttribute("sno", sno);
        model.addAttribute("contact", new Contact());
        return "contactWithSno";
    }

    @PostMapping("/contact/{sno}")
    public String contactSaved(@ModelAttribute Contact contact, @PathVariable("sno") Long sno){
        SignUp signUp = signUpService.findById(sno);
        Concerns concern = Concerns.builder()
                .name(signUp.getName())
                .email(signUp.getEmail())
                .concern(contact.getConcern())
                .build();
        concernsService.saveConcern(concern);
        return "contactSavedWithSno";
    }
}
