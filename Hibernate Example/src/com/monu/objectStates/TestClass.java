package com.monu.objectStates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestClass {
	public static void main(String[] args) {
		Student student = new  Student();
		student.setId(2);
		student.setName("Monu");
		student.setRoll(1);
		student.setAge(25);
		student.setEmail("munnar.patro36@gmail.com");
		student.setCourse("MCA");
		
		Configuration config = new Configuration().configure("objectStates.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.save(student);
		
		session.beginTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
