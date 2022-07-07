package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		System.out.println("Project Started..........");
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Student student=new Student(1, "Nikhil","Nanded");
		Student student2=new Student(3, "SURAJ","NAGPUR");
		Student student4=new Student(6, "SANKET","WARUD");
		Student student3=new Student(8, "PRAJIT","WARDHA");

		session.saveOrUpdate(student);
	//session.save(student2);
	//session.save(student3);
     session.save(student4);
		//session.saveOrUpdate(student3);
        
		tx.commit();



	}
}
