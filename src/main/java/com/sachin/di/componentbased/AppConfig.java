package com.sachin.di.componentbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@ComponentScan(basePackages = "com.sachin.di.componentbased")
@Configuration
public class AppConfig {

	
	@Bean(value="stu")
	Student getStudent() {
		return new Student();
	}
	
}
