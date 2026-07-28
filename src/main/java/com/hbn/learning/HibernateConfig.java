package com.hbn.learning;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.hbn.learning.entity.Employee;

public class HibernateConfig {
	
	public static SessionFactory getsessionFactory(){
		
//		StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		
		Properties properties = new Properties();
		
		
		
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		properties.put(Environment.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/java11");
		properties.put(Environment.JAKARTA_JDBC_USER,"root");
		properties.put(Environment.JAKARTA_JDBC_PASSWORD, "Ashish@123");
		properties.put(Environment.HBM2DDL_AUTO,"update");
		properties.put(Environment.SHOW_SQL,"true");
		properties.put(Environment.FORMAT_SQL,"true");
		
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties).build();
		
		Metadata meta = new MetadataSources(ssr).addAnnotatedClass(Employee.class).getMetadataBuilder().build();
		
		
		return meta.buildSessionFactory();
		
		
		
		
		
		
		
		
		
	}
	
	
}
