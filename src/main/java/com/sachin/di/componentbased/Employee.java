package com.sachin.di.componentbased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component

public class Employee {

//	private String name;
//	private int id;
//	
//	public Employee(String name, int id) {
//		super();
//		this.name = name;
//		this.id = id;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", id=" + id + "]";
//	}
	
	public Employee() {
		 System.out.println("Constructor Calling...");
	}
	
}
