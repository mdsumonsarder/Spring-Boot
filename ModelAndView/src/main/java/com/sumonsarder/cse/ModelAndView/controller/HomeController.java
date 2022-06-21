package com.sumonsarder.cse.ModelAndView.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping(value = "/addProgrammer", method = RequestMethod.POST)
    public ModelAndView addProgrammer(@RequestParam("pId") int i, @RequestParam String pName, @RequestParam String pLang){
       ModelAndView mv = new ModelAndView();
       mv.setViewName("showPage.html");
       mv.addObject("pId",i);
       mv.addObject("pName",pName);
       mv.addObject("pLang",pLang);
       return mv;
    }

}
