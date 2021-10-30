package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Component.DemoBean;

@SpringBootApplication
public class SpringConceptsDemoApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsDemoApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to spring concepts demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsDemoApplication.class, args);
		logger.debug("Checking context: ={}",context.getBean(DemoBean.class));
	}
}
