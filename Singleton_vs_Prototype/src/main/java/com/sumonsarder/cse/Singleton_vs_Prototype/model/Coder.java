package com.sumonsarder.cse.Singleton_vs_Prototype.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
//@Scope(value = "singleton") //When One Object in same class;
@Scope(value = "prototype") //When Multiple Object in same class;
public class Coder {

    public String name;

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
