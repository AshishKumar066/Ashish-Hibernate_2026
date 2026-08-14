package com.hbn.learning;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbn.learning.entity.Address;
import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		Employee emp= new Employee("Avinash Jain", "Male", 890000);

		Address add1 = new Address("Noida","up",201301);
		
		Session session = HibernateConfig.getsessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		

		session.persist(emp);
		session.persist(add1);
		
	}

}
