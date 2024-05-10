package com.sachin.di.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext acc=new ClassPathXmlApplicationContext("com/sachin/di/autowired/Config.xml");
		
		Employee emp = (Employee)acc.getBean("em");
		
		System.out.println(emp);
		System.out.println(emp.getAddress().getCity());
		System.out.println(emp.getAddress().getCity());
	}
}
