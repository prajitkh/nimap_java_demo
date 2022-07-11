package com.many;

import java.util.ArrayList;
import java.util.List;



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
		Employee emp=new Employee();
		emp.setEmpId(121);
		emp.setEmployee("NAKUL KURKURE");


		Address ad=new Address();
		ad.setAddressId(10);
		ad.setAddress("karve nagar");
		ad.setEmployee(emp);

		Address ad1=new Address();
		ad1.setAddressId(11);
		ad1.setAddress("Nagp");
		ad1.setEmployee(emp);
		
		
		Address ad2=new Address();
		ad2.setAddressId(12);
		ad2.setAddress("Lonavla");
		ad2.setEmployee(emp);
		
		
		List<Address>list=new ArrayList<Address>();
		list.add(ad1);
		list.add(ad);
		list.add(ad2);
		
		emp.setAddress(list);
		Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
		session.save(emp);
		session.save(ad1);
		session.save(ad);
		session.save(ad2);
		
		
		tx.commit();

		session.close();
		factory.close();
		

	}
}
