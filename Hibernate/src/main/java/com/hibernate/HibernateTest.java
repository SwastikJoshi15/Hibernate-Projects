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
		user.setDescription("New Employ");

		Address addr = new Address();
		addr.setCityName("Haldwani");
		addr.setPinCode("263139");
		addr.setStateName("Uttrakhand");
		addr.setStreatName("LocalStreat");

		Address addr2 = new Address();
		addr2.setCityName("Banglore");
		addr2.setPinCode("560023");
		addr2.setStateName("Karnataka ");
		addr2.setStreatName("LocalStreat");
		user.setOfficeAddress(addr2);

		user.setHoemAddress(addr);

		UserDetails user2 = new UserDetails();

		user2.setUserName("Shiva Joshi");
		user2.setJoinedDate(new Date());
		user2.setDescription("New Employ");

		user2.setOfficeAddress(addr2);
		user2.setHoemAddress(addr);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.persist(user);
		session.persist(user2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

		;
	}

}
