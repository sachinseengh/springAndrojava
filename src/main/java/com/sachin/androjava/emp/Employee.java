package com.sachin.androjava.emp;

public class Employee {

	
	Employee(){
		System.out.println("constr chalyo");
	}
	
	private String Name;
	private int id;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", id=" + id + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
