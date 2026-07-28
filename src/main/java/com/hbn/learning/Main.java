package com.hbn.learning;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		Employee emp1= new Employee("Anup", "Male", 890000,"HCL");
//		Employee emp2= new Employee("Tom ", "Male", 890000,"HCL");
//		Employee emp3= new Employee("Hana", "Female", 890000,"HCL");
//		Employee emp4= new Employee("Rudra ", "Male", 890000,"HCL");
//		Employee emp5= new Employee("Bella ", "Female", 890000,"HCL");
//		Employee emp6= new Employee("Anuragh Kumar", "Male", 890000,"HCL");

		
		Session session = HibernateConfig.getsessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
//		session.persist(emp4);
//		session.persist(emp5);
//		session.persist(emp6);
////		
		transaction.commit();

		
//		get is depricated means it's updated based on new version !!
		
//		Employee employee = session.find(Employee.class, 3);
//		
//		System.out.println(employee);
		
//		session.load(emp1, 1);
//		System.out.println(emp1);
		
		Employee employee = session.find(Employee.class,10);
		System.out.println(employee);
		
		
		session.load(emp1, 10);
		System.out.println(emp1);
		
		
	}

}
