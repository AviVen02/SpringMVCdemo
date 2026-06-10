package com.example.Validationdemo.controller;

import com.example.Validationdemo.Model.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
public class customercontroller {

    @Autowired
    Customer customer;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor= new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/showform")
    public String showform(Model model)
    {
        model.addAttribute("customers", customer);

        return "showform";
    }

    @PostMapping("/processform")
    public String processform(@Valid @ModelAttribute("customers") Customer customers, BindingResult Bind ) {

        if (Bind.hasErrors()) {
            return "showform";
        } else {
            return "lastform";
        }

    }
}
