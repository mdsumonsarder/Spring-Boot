package com.sumonsarder.cse.Java_Config_Based_Constructor_Injection;

import com.sumonsarder.cse.Java_Config_Based_Constructor_Injection.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JavaConfigBasedConstructorInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JavaConfigBasedConstructorInjectionApplication.class, args);

		Coder c1 = (Coder) context.getBean("coder1");
		System.out.println("Id: "+c1.getId());
		System.out.println("Name: "+c1.getName());
		System.out.println("Language: "+c1.getLanguage());
		System.out.println("Brand: "+c1.getComputer().getBrand());

	}

}
