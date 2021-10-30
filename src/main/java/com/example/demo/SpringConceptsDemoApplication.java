package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Component.DemoBean;

@SpringBootApplication
public class SpringConceptsDemoApplication {

	public static void main(String[] args) {
		System.out.print("Welcome to spring concept demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsDemoApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("Demo Bean ="+demoBean.toString());
	}

}
