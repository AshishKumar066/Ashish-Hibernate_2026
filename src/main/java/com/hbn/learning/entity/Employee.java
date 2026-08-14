package com.hbn.learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;



@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name ;
	private String gender;
	private int salary;
	
	
	
//	Implementation for add two tables through one table 
	@OneToOne
	private Address address;
	
	
	public Employee() {
	}

	public Employee( String name, String gender, int salary)
	{
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Employee [Id= "+id+ ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
}
