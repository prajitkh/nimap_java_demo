package com.mapping1;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {



		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();


		Emp emp1=new Emp();

		Emp emp2=new Emp();

		emp1.setEmp_id(11);
		emp1.setEmpName("rahul");

		emp2.setEmp_id(12);
		emp2.setEmpName("ram");


		Project p1=new Project();
		Project p2=new Project();

		p1.setId(34);
		p1.setName("java project");

		p2.setId(35);
		p2.setName("hibernate project");	



		List<Emp>list1=new ArrayList<Emp>();
		List<Project>list2=new ArrayList<Project>();

		list1.add(emp2);
		list1.add(emp1);

		list2.add(p2);
		list2.add(p1);


		emp1.setProjects(list2);
		p2.setEmp(list1);


		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();

		session.save(emp1);
		session.save(emp2);
		session.save(p1);
		session.save(p2);



		tx.commit();
		session.close();

		factory.close();





	}


}
