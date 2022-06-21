package com.sumonsarder.cse.Method_Level_ModelAttribute.controller;

import com.sumonsarder.cse.Method_Level_ModelAttribute.model.Programmer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@ControllerAdvice //When multiple controller is available then used @ControllerAdvice;
public class HomeController {

    @ModelAttribute  //When Same message show multiple view then used method base @ModelAttribute;
    public void welcome(Model model){
        model.addAttribute("message","Hi, I'm Md. Sumon Sarder");
    }

    @RequestMapping("/home")
    public String homePage(Model model){
        return "homePage.html";
    }

    //@ModelAttribute("p")
    @RequestMapping(value = "/addProgrammer", method = RequestMethod.POST)
    public String addProgrammer(@ModelAttribute("p") Programmer programmer){
        return "showPage.html";
    }
}
