package com.example.form_data.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Formcontroller {

    @RequestMapping("/showform")
    public String  shoefrom(){
        return "HelloWorld-form";
    }

    @RequestMapping("/process")
    public String process()
    {
        return "hello-to-helloworld";
    }

    @RequestMapping("/Processthedata")
    public String processform(HttpServletRequest request, Model model){
        //public String processFormVersionThree(@RequestParam("studentName") String Name, Model model)

        String name= request.getParameter("studentname");

        String value =name.toUpperCase();
        String result= value;

        model.addAttribute("result1", result);



        return "Helloprocess";
    }

}
