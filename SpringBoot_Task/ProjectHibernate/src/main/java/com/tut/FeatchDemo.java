package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FeatchDemo {
	
	public static void main(String[] args) {
		
		//get method,load method
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		
		Student student=session.get(Student.class, 106);
		System.out.println(student);
	
	
		
	Address address=session.load(Address.class,1);
	System.out.println(address);
	

	
	Address address1=session.load(Address.class,1);
	System.out.println(address1);
	
		session.close();
		System.out.println("Done...");
	
		
		
	}

}
