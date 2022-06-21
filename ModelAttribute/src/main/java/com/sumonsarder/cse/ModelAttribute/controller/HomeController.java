package com.sumonsarder.cse.ModelAttribute.controller;

import com.sumonsarder.cse.ModelAttribute.model.Programmer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String homePage(Model model){
        return "homePage.html";
    }

   /*@RequestMapping(value = "/addProgrammer", method = RequestMethod.POST)
     public ModelAndView addProgrammer(@ModelAttribute Programmer programmer){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("showPage.html");
        return mv;
    }*/

    //@ModelAttribute("p")
    @RequestMapping(value = "/addProgrammer", method = RequestMethod.POST)
    public String addProgrammer(@ModelAttribute("p") Programmer programmer){
        return "showPage.html";
    }

}
