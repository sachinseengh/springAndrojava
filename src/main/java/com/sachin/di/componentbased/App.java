package com.sachin.di.componentbased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
  
		
		Student s = (Student) ac.getBean("stu");
	}

}
