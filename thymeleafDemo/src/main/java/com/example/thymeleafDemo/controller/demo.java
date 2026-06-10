package com.example.thymeleafDemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class demo {



    @GetMapping("/demo")
    public String sayhello(Model themodel){
        int value=10;
        themodel.addAttribute("theData", "string is works");
        return "hello";
    }



}


