package com.sumonsarder.cse.Java_Config_Based_Setter_Injection.config;

import com.sumonsarder.cse.Java_Config_Based_Setter_Injection.model.Coder;
import com.sumonsarder.cse.Java_Config_Based_Setter_Injection.model.Computer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Coder coder1(@Qualifier("computer1") Computer computer){
        Coder c1 = new Coder();
        c1.setId(1001);
        c1.setName("Md. Sumon Sarder");
        c1.setLanguage("Java Spring Boot");
        c1.setComputer(computer);
        return c1;
    }

    @Bean
    public Computer computer1(){
        Computer com1 = new Computer();
        com1.setBrand("HP");
        return com1;
    }


    @Bean
    public Coder coder2(@Qualifier("computer2") Computer computer){
        Coder c2 = new Coder();
        c2.setId(1001);
        c2.setName("Md. Sumon Sarder");
        c2.setLanguage("Java Spring Boot");
        c2.setComputer(computer);
        return c2;
    }

    @Bean
    public Computer computer2(){
        Computer com2 = new Computer();
        com2.setBrand("DELL");
        return com2;
    }
}
