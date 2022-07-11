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
		que.setQuestionId(1215);
		que.setQuestion("JRE Full form ?");

		Question que1=new Question();
		que1.setQuestionId(1216);
		que1.setQuestion("JDK FULL FORM ?");


		///creating answer
		Answer ans=new Answer();
		ans.setAnswerId(318);
		ans.setAnswer("Java Runtime Environment..");
		ans.setQuestion(que);
		que.setAnswer(ans);

		Answer ans1=new Answer();
		ans1.setAnswerId(319);
		ans1.setAnswer("Java Devolpment KIT..");
		ans1.setQuestion(que1);
		que1.setAnswer(ans1);

		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(que);
		session.save(ans);

		session.save(que1);
		session.save(ans1);
		tx.commit();

		///featching data

//		Question q=session.get(Question.class,1215);
//		System.out.println(q.getQuestion());
//		System.out.println(q.getAnswer().getAnswer());

		session.close();
		factory.close();


	}
}
