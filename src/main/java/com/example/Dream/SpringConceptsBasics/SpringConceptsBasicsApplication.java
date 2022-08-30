package com.example.Dream.SpringConceptsBasics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringConceptsBasicsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringConceptsBasicsApplication.class, args);
     BinarySearch bst = applicationContext.getBean(BinarySearch.class);
		System.out.printf(String.valueOf(bst.Search()));
	}

}
