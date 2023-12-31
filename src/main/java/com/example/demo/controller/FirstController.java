package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String NiceToMeetYou(Model model){
        model.addAttribute("username","안녕");
        return "greeting";
    }
    @GetMapping("/bye")
    public String SeeYouNext(Model model){
        model.addAttribute("nickname","User1");
        return "goodbye";
    }
}
