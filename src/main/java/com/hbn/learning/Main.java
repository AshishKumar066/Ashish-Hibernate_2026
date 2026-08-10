package com.hbn.learning;

import java.beans.Transient;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		Employee emp1= new Employee("Avinash Jain", "Male", 890000,"HCL");
//		Employee emp1= new Employee(1,"Avinash Jain", "Male", 890000,"HCL");

//		Employee emp2= new Employee("Tom ", "Male", 890000,"HCL");
//		Employee emp3= new Employee("Hana", "Female", 890000,"HCL");
//		Employee emp4= new Employee("Rudra ", "Male", 890000,"HCL");
//		Employee emp5= new Employee("Bella ", "Female", 890000,"HCL");
//		Employee emp6= new Employee("Anuragh Kumar", "Male", 890000,"HCL");

		
		Session session = HibernateConfig.getsessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		
//		HQL Query : It's same as SQL (Structured Query Language ) but it doesn't depends on the table of the database. Insted of table name, we use class name in HQL. So it is database independent query language.
//		Advantages of HQL 
//			1. database independent 
//			2. easy to learn for Java Programming
//	Step 1: 
		
//		Query query = session.createQuery("from Employee",Employee.class);
//		List list = query.list();		
////		System.out.println(query.list());
//		System.out.println(list);
		
//	Step 2:
		
//		If we need some data form the database
		
//		Query query = session.createQuery("from Employee",Employee.class);
//		query.setFirstResult(2);
//		query.setMaxResults(4);
//		List list = query.list();
//		System.out.println(list);
		
//		Step 3:
		
//		If we need to update any data HQL update query
		
//		Query query = session.createQuery("update Employee set name = :n, salary = :s where id = :i ",Employee.class);
		 
//		MutationQuery query = session.createMutationQuery("update Employee set name =:n , salary =:s where  id =:i");
//		
//		query.setParameter("n","Divu");  // name which require to update 
//		query.setParameter("s",90230); // salary which require to update 
//		query.setParameter("i", 4);   // id name 
//		query.executeUpdate();
//		transaction.commit();
//		
//		
//		Query query2 = session.createQuery("from Employee",Employee.class);
//		List list = query2.list();
//		System.out.println(list);

//	Step 4:
		
//		If we need to delete any data form the table using HQL
		
//		MutationQuery query = session.createMutationQuery("delete from Employee where id =:i");
//		query.setParameter("i",4);
//		query.executeUpdate();
//		transaction.commit();
//		
//		Query query2 = session.createQuery("from Employee ",Employee.class);
//		
//		List list = query2.list();
//		System.out.println(list);
		
//	Step 5:
		
//		If we need to sum of any column data usin function then run this query 
		
//		Query query1 = session.createQuery("SELECT SUM(salary) from Employee");
//		Query query2 = session.createQuery("SELECT MIN(name) from Employee ");
//		Query query3 = session.createQuery("SELECT MAX(name) from Employee ");
//		Query query4 = session.createQuery("SELECT COUNT(name) from Employee");
//		Query query5 = session.createQuery("SELECT AVG(salary) FROM Employee");
//
////		
//		System.out.println(query1.list());
//		System.out.println(query2.list());
//		System.out.println(query3.list());
//		System.out.println(query4.list());
//		System.out.println(query5.list());

//		HW: Question :- What is hibernate mapping & types of hibernate mapping (one to one, one to many, many to one, many to many)
//						Association ?
		 
		
		
//		NamedQuery Anotation ---------------------
		
		Query<Employee> query =session.createNamedQuery("Employee.findEmployeeById",Employee.class);
		query.setParameter("id", "5");
		List<Employee> employees = query.getResultList();
		System.out.println(employees);
		
		System.out.println();
		
		Query<Employee> q = session.createNamedQuery("Employee.findByGender",Employee.class);
		q.setParameter("gender","male");
		System.out.println(q.list());
		
//		session.close();
		
		
		
		
		
//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
//		session.persist(emp4);
//		session.persist(emp5);
//		session.persist(emp6);
		
//		transaction.commit();

		
//		get is depricated means it's updated based on new version !!
		
//		Employee employee = session.find(Employee.class, 35);
//		System.out.println(employee);   // find data nhi milne par null show krta h 
		
//		session.load(emp1, 35);
//		System.out.println(emp1);      // load null pointer exception show krta h 
		
//		Employee employee = session.find(Employee.class,10);
//		System.out.println(employee);
//		
		
//		session.load(emp1, 10);
//		System.out.println(emp1);
//		
	}

}
