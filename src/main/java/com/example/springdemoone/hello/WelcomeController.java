package com.example.springdemoone.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping
    public String About_us(Model model){
        model.addAttribute("aboutUs", "My name is maira. I am a backend developer.");
        return "welcome";
    }

    @GetMapping("/Contact")
    public String Contact_us(Model model){
        model.addAttribute("contactUs", "0123456789");
        return "city";
    }
}
