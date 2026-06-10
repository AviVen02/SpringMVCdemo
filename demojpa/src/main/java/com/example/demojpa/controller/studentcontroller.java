package com.example.demojpa.controller;

import com.example.demojpa.model.Student;
import com.example.demojpa.services.Stdsevices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class studentcontroller {

    public final Stdsevices stdsevices;

    public studentcontroller(Stdsevices stdsevices){
        this.stdsevices=stdsevices;
    }

    @GetMapping("/show")
    public String liststudent(Model model){
        List<Student> students=stdsevices.getallstudent();
        model.addAttribute("allstudent", students);
        return "studentform";
    }

    @GetMapping("/showformstudent")
    public String showaddstudentform(Model model, @ModelAttribute("student") Student student){
//        Student student=new Student();
//        model.addAttribute("student",student);
        return "addstudentform";
    }
    @PostMapping("/processstudentform")
    public String studentform(@ModelAttribute("student") Student student)
    {
        stdsevices.addstudent(student);
        return "redirect:/student/show";
    }

    @GetMapping("/showupdateform")
    public String updatestudent(@RequestParam("studentrollno")int therollno,Model model)
    {
        Student stud=stdsevices.studentbtid(therollno);
        model.addAttribute("student", stud);
        return "addstudentform";
    }

    @GetMapping("studentiddelete")
    public String deletestudent(@RequestParam("studentrollno")int roll){
        stdsevices.deletebyid(roll);
        return "redirect:/student/show";
    }


}

