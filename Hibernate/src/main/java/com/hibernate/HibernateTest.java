package com.hibernate;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user = new UserDetails();
		user.setUserID(1);
		user.setUserName("Swastik Joshi");
		user.setJoinedDate(new Date());
		user.setAddress("Haldwani");
		user.setDiscription("New Employ");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();

		user = null;
		session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails) session.get(UserDetails.class, 1);
		System.out.println(
				"User name retrived is " + user.getUserName() + ";" + "User Adderss retreved is  " + user.getAddress());
	}

}
