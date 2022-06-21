package com.sumonsarder.cse.Java_Config_Based_Setter_Injection;

import com.sumonsarder.cse.Java_Config_Based_Setter_Injection.config.BeanConfig;
import com.sumonsarder.cse.Java_Config_Based_Setter_Injection.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({BeanConfig.class})
public class JavaConfigBasedSetterInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JavaConfigBasedSetterInjectionApplication.class, args);

		Coder c1 = (Coder) context.getBean("coder1");
		System.out.println("Id: "+c1.getId());
		System.out.println("Name: "+c1.getName());
		System.out.println("Language: "+c1.getLanguage());
		System.out.println("Brand: "+c1.getComputer().getBrand());

		Coder c2 = (Coder) context.getBean("coder2");
		System.out.println("Id: "+c2.getId());
		System.out.println("Name: "+c2.getName());
		System.out.println("Language: "+c2.getLanguage());
		System.out.println("Brand: "+c2.getComputer().getBrand());

	}

}
