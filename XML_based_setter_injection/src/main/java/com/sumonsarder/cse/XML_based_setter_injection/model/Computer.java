package com.sumonsarder.cse.XML_based_setter_injection.model;

import javax.annotation.PreDestroy;

public class Computer {

    private String brand;

    public Computer() {
        super();
        System.out.println("No - Args constructor are called (Computer Class)");
    }

    public Computer(String brand) {
        this.brand = brand;
        System.out.println("All - Args constructor are called (Computer Class)");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Computer object destroyed");
    }

}
