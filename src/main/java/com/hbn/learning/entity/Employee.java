package com.hbn.learning.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Transient;



// Named Querry Anotation 

@NamedQuery(
		name="Employee.findEmployeeById",
		query = "FROM employee E WHERE E.id >:id"
		)

@NamedQuery(
		name="Employee.findByGender",
		query="SELECT e FROM employee e WHERE e.gender = :gender"
		)







@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name ;
	private String gender;
	private int salary;
	
	
//	if we want that , don't add variable or not require to create column into the database then use it
	@Transient
	private String compName;
	
	
	
	
	public Employee() {
	}



	public Employee( String name, String gender, int salary,String compName)
	{
		this.setCompName(compName);
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}


//	getter / setter : Used for access the values by a other package or class and it's also use for update any values at the run time.
	
	
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



	public String getCompName() {
		return compName;
	}



	public void setCompName(String compName) {
		this.compName = compName;
	}


	
//	 ToString : Kisi object ke attributes ko print krna ho to tostring use krte h (toString is used for print the attributes of any objects) 

	@Override
	public String toString() {
		return "Employee [Id= "+id+ ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
