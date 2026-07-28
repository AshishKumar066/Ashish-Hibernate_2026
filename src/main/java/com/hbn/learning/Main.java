package com.hbn.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hbn.learning.HibernateConfig;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
//		Employee emp = new Employee(2,"Anuragh Kumar", "Male", 890000);
		
		Employee emp = new Employee(1,"Anuragh Kumar", "Male", 890000);

		
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		SessionFactory sessionFactory = HibernateConfig.getsessionFactory();
		
		
		Session session = HibernateConfig.getsessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		
//		Transaction transaction = sessionFactory.openSession().beginTransaction();

		
		session.persist(emp);
		
		transaction.commit();
		
	}

}
