package com.sumonsarder.cse.Autowired_Annotation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Coder {

    @Autowired
    Dog dog;

    public Coder() {
        System.out.println("Coder Object Created.");
    }

    public void petInfo() {
        dog.info();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Coder Object destroyed.");
    }
}
