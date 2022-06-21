package com.sumonsarder.cse.Query_DSL.controller;

import com.sumonsarder.cse.Query_DSL.model.Programmer;
import com.sumonsarder.cse.Query_DSL.repository.ProgrammerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProgrammerRepo programmerRepo;

    @GetMapping("/home")
    public String homePage(Model model){
        return "homePage.html";
    }

    @PostMapping("/addProgrammer")
    public String addProgrammer(@ModelAttribute("p") Programmer programmer){
        programmerRepo.save(programmer);
        return "redirect:/home";
    }

    @PostMapping("/findById")
    public String findById(@RequestParam int pId, Model model){
        Programmer p = programmerRepo.getOne(pId);
        model.addAttribute("programmer",p);
        return "programmerInfo.html";
    }

    @GetMapping("/deleteProgrammer")
    public String deleteProgrammer(@RequestParam int pId){
        programmerRepo.deleteById(pId);
        return "redirect:/home";
    }

    @PostMapping("/updateProgrammer")
    public String updateProgrammer(@ModelAttribute Programmer programmer){
        Programmer p = programmerRepo.getOne(programmer.getpId());
        p.setpName(programmer.getpName());
        p.setpLang(programmer.getpLang());
        programmerRepo.save(p);
        return "programmerInfo.html";
    }

    //Query DSL;
    @PostMapping("/findByLang")
    public String findByLang(@RequestParam String pLang, Model model){
        List<Programmer> p = programmerRepo.findBypLang(pLang);
        model.addAttribute("programmers",p);
        return "allProgrammers.html";
    }

    //Custom SQL;
    @PostMapping("/findByName")
    public String findByName(@RequestParam Collection<String> pName, Model model){
        //Custom SQL;
        System.out.println("pName: "+pName);
        List<Programmer> p = programmerRepo.findP(pName);
        model.addAttribute("programmers",p);
        return "allProgrammers.html";
    }


   /* @PostMapping("/findByName")
    public String findByName(@RequestParam String pName, String pLang, Model model){
        //Custom SQL;
        List<Programmer> p = programmerRepo.findP(pName, pLang);
        model.addAttribute("programmers",p);
        return "allProgrammers.html";
    }*/

}
