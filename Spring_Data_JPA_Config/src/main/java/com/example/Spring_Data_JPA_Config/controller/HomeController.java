package com.example.Spring_Data_JPA_Config.controller;

import com.example.Spring_Data_JPA_Config.model.Programmer;
import com.example.Spring_Data_JPA_Config.repository.ProgrammerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@ControllerAdvice //When multiple controller is available then used @ControllerAdvice;
public class HomeController {

    @Autowired
    private ProgrammerRepo programmerRepo;

    @ModelAttribute  //When Same message show multiple view then used method base @ModelAttribute;
    public void welcome(Model model){
        model.addAttribute("message","Hi, I'm Md. Sumon Sarder");
    }

    @GetMapping("/home")
    public String homePage(Model model){
        return "homePage.html";
    }

    //@ModelAttribute("p")
    @PostMapping("/addProgrammer")
    public String addProgrammer(@ModelAttribute("p") Programmer programmer){
        programmerRepo.save(programmer);

        return "showPage.html";
    }

    @GetMapping("/allProgrammer")
    public String allProgrammers(Model model){
        List<Programmer> p = new ArrayList<>();
        p.add(new Programmer(1001,"Md. Sumon Sarder","Java Spring Boot"));
        p.add(new Programmer(1002,"Md. Sumon Sarder","Java Spring Boot"));
        p.add(new Programmer(1003,"Md. Sumon Sarder","Java Spring Boot"));

        model.addAttribute("programmers",p);

        return "allProgrammers.html";
    }
}
