package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddDemo {

	public static void main(String[] args) {
		System.out.println("Project Started..........");
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		//create student object
		Student student=new Student();
		student.setId(105);
		student.setName("SU");
		student.setCity("PUNE");

		Certificate certi=new Certificate();
		certi.setCourse("SPRING");
		certi.setDuration("3 Months");

		student.setCerti(certi);



		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		

		tx.commit();
		session.close();
		factory.close();


	}
}
