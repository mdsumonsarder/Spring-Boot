package com.sumonsarder.cse.Singleton_vs_Prototype.model;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Dog {

    public Dog() {
        System.out.println("Dog Object Created.");
    }

    public void info() {
        System.out.println("This is a German sheperd Dog");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Dog Object Destroyed.");
    }

}
