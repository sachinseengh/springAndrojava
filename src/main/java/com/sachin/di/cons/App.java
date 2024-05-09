package com.sachin.di.cons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext acc=new ClassPathXmlApplicationContext("com/sachin/di/cons/Config.xml");
		
		Employee emp = (Employee)acc.getBean("emp");
		
		System.out.println(emp);
	}
}
