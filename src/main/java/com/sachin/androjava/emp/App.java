package com.sachin.androjava.emp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContex.xml");

		
		Employee ee =(Employee)  ac.getBean("emp");
		System.out.println(ee);
	}

}
