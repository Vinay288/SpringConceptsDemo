package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Component.DemoBean;
import com.example.demo.Component.EmployeeBean;

@SpringBootApplication
public class SpringConceptsDemoApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsDemoApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to spring concepts demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsDemoApplication.class, args);
		logger.debug("Checking context: ={}",context.getBean(DemoBean.class));
		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(110);
		employeeBean.setEname("abcd");
		employeeBean.showEmployeeDetails();
	}
}
