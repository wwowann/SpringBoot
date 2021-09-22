package com.myLesson.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.myLesson.demo")
public class DemoApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println(context.getBean("devProfile"));
		System.out.println(context.getBean("prodProfile"));
	}

}
