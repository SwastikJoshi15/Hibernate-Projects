package com.hibernate;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		
		user.setUserName("Swastik Joshi");
		user.setJoinedDate(new Date());
		user.setAddress("Haldwani");
		user.setDiscription("New Employ");
		
		UserDetails user2 = new UserDetails();
		
		user2.setUserName("Shiva Joshi");
		user2.setJoinedDate(new Date());
		user2.setAddress("Haldwani");
		user2.setDiscription("New Employ");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();

		;
	}

}
