package com.sumonsarder.com.SocialLogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Home, Hello Home!";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Secured, Hello Secured!";
    }
}
