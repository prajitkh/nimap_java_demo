package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {


	public static void main(String[] args) {
		System.out.println("Project Started..........");
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();

		Question que=new Question();
		que.setQuestionId(1213);
		que.setQuestion("What is hibernate");
		///creating answer
		Answer ans=new Answer();
		ans.setAnswerId(316);
		ans.setAnswer("hibernate is framework in java");
		que.setAnswer(ans);

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(que);
        session.save(ans);
		tx.commit();
		session.close();



	}
}
