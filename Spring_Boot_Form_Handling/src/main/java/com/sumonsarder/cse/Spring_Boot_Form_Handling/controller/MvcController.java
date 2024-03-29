package com.sumonsarder.cse.Spring_Boot_Form_Handling.controller;

import com.sumonsarder.cse.Spring_Boot_Form_Handling.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;


@Controller
public class MvcController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Going home...");
        return "index";
    }

    @GetMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");

        model.addAttribute("user", user);
        model.addAttribute("professionList", professionList);
        return "register_form";
    }

    @PostMapping("/register")
    public String submitForm(@ModelAttribute("user") User user) {
        System.out.println(user);

        return "register_success";
    }

}
