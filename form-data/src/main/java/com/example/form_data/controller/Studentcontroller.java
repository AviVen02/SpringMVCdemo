package com.example.form_data.controller;

import com.example.form_data.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class Studentcontroller {

    @Autowired
    student std;



    @RequestMapping("/display")
    public String displaystudentfield(Model model){
        model.addAttribute("stud", std);
        return "studenthtml";
    }

    @GetMapping("/processstudetdata")
    public String process(@ModelAttribute("stud") student thestud)
    {
        System.out.println("theStudent: " + thestud.getFirstname() + " " + thestud.getLastname());
        return "studentoutput";
    }

}
