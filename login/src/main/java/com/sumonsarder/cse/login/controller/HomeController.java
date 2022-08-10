package com.sumonsarder.cse.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/home"})
    public String homePage(Model model){
        model.addAttribute("message","Md. Sumon Sarder");
        return "home";
    }

    @GetMapping("/hello")
    public String helloUser(){
        return "helloUser";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/deshbord")
    public String deshbord(){
        return "deshbord";
    }
}
