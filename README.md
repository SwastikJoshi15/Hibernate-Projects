Overview
This project demonstrates a basic Hibernate setup for persisting data in a relational database. It uses Hibernate ORM (Object-Relational Mapping) to manage the persistence of Java objects to a database.

Project Structure
HibernateTest.java: The main class for running the Hibernate application. It sets up the Hibernate configuration, creates UserDetails and Address objects, and saves them to the database.
UserDetails.java: Entity class representing user details. It includes fields like userName, joinedDate, description, and an associated Address.
Address.java: Entity class representing the address of a user. It includes fields like cityName, pinCode, stateName, and streetName.
Prerequisites
Java Development Kit (JDK) 8 or higher
Hibernate ORM 5.x
PostgreSQL or another relational database (make sure to adjust the database configuration in hibernate.cfg.xml if necessary
