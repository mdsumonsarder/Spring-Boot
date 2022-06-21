package com.sumonsarder.cse.Model_ModelMap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String homePage(Model model){
        return "homePage.html";
    }


    //Model model, int pId, String pName, String pLang
    // @RequestParam int pId, @RequestParam String pName, @RequestParam String pLang, Model model
    //ModelMap and Model mainly same work;
    @RequestMapping(value = "/addProgrammer", method = RequestMethod.POST)
    public String addProgrammer(Model model, int pId, String pName, String pLang){

        System.out.println("PId: "+pId+" "+"pName: "+pName+" "+"pLan: "+pLang);

        model.addAttribute("pId",pId);
        model.addAttribute("pName",pName);
        model.addAttribute("pLang",pLang);

        return "showPage.html";
    }

}
