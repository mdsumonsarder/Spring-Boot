package com.example.AOP_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AopProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AopProjectApplication.class, args);

		AopClass aopClass = context.getBean(AopClass.class);

		aopClass.hello();
		aopClass.printSomething("Sumon Sarder");
		System.out.println(aopClass.sum(10,20));

		AnotherClass anotherClass = context.getBean(AnotherClass.class);
		System.out.println(anotherClass.anotherMethod(10));

	}

}
