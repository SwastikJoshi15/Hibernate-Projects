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
		
		Address addr =new Address();
		addr.setCityName("Haldwani");
		addr.setPinCode("263139");
		addr.setStatename("Uttrakhand");
		addr.setStreatName("LocalStreat");
		user.setAddress(addr);
		
		UserDetails user2 = new UserDetails();
		
		user2.setUserName("Shiva Joshi");
		user2.setJoinedDate(new Date());
		user2.setDescription("New Employ");
		
		Address addr2 =new Address();
		addr2.setCityName("Haldwani");
		addr2.setPinCode("263139");
		addr2.setStatename("Uttrakhand");
		addr2.setStreatName("LocalStreat");
	    user2.setAddress(addr2);;

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

		;
	}

}
