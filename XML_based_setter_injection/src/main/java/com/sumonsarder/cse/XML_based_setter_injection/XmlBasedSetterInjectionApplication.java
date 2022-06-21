package com.sumonsarder.cse.XML_based_setter_injection;

import com.sumonsarder.cse.XML_based_setter_injection.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:BeanConfig.xml"})
public class XmlBasedSetterInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(XmlBasedSetterInjectionApplication.class, args);

		Coder c1 = (Coder) context.getBean("coder1");
		System.out.println("Id: "+c1.getId());
		System.out.println("Name: "+c1.getName());
		System.out.println("Language: "+c1.getLanguage());
		System.out.println("Band: "+c1.getComputer().getBrand());

	}

}
