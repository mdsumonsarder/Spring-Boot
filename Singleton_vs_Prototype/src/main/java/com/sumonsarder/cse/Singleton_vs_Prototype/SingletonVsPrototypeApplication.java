package com.sumonsarder.cse.Singleton_vs_Prototype;

import com.sumonsarder.cse.Singleton_vs_Prototype.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SingletonVsPrototypeApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SingletonVsPrototypeApplication.class, args);

		Coder c1 = context.getBean(Coder.class);
        c1.name = "Sumon Sarder";
		System.out.println("Name: "+c1.name);

		Coder c2 = context.getBean(Coder.class);
		System.out.println("Name: "+c2.name);
	}

}
