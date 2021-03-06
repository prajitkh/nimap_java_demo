package com.tut;

import java.util.Date;

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


		//creating student object
		Student student=new Student();
		student.setId(107);
		student.setCity("PUNE");
		student.setName("ASHISH");
		System.out.println(student);

		//address class object
		Address ad=new Address();
		ad.setStreet("stree2");
		ad.setCity("BERLIN");
		ad.setOpean(true);
		ad.setAddedDate(new Date());
		ad.setX(1203.7); 

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();

		session.save(student);
		session.save(ad);


		tx.commit();
		session.close();
		System.out.println("DONE...!!!!!");


	}
}
