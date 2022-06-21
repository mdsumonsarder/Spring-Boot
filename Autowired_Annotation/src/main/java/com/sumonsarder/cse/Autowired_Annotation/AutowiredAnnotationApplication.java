package com.sumonsarder.cse.Autowired_Annotation;

import com.sumonsarder.cse.Autowired_Annotation.model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AutowiredAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutowiredAnnotationApplication.class, args);

		Coder c1 = context.getBean(Coder.class);
		c1.petInfo();
	}

}
