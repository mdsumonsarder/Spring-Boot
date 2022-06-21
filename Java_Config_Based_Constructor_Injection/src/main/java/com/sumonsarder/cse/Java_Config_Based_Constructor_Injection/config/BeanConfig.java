package com.sumonsarder.cse.Java_Config_Based_Constructor_Injection.config;

import com.sumonsarder.cse.Java_Config_Based_Constructor_Injection.model.Coder;
import com.sumonsarder.cse.Java_Config_Based_Constructor_Injection.model.Computer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Coder coder1(Computer computer){
        Coder c1 = new Coder(1001,"Md. Sumon Sarder","Java Spring Boot",computer);
        return c1;
    }

    @Bean
    public Computer computer1(){
        Computer com1 = new Computer();
        com1.setBrand("HP");
        return com1;
    }
}
