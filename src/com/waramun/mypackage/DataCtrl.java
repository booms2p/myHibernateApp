package com.waramun.mypackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Configuration;

public class DataCtrl {
	
	protected SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	protected void setup() {
		// code to load Hibernate Session factory
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}

	protected void exit() {
		// code to close Hibernate Session factory
		sessionFactory.close();
	}

	protected void create() {
		// code to save data
	}

	protected void read() {
		// code to get data
		Session session = sessionFactory.openSession();
		
		EplClub club = session.get(EplClub.class, 1);

		System.out.println("ID: " + club.getId());
		System.out.println("Club Name: " + club.getClubName());
		System.out.println("Stadium: " + club.getStadium());
		System.out.println("Capacity: " + club.getCapacity());

		session.close();
	}

	protected void update() {
		// code to modify data
	}

	protected void delete() {
		// code to remove data
	}

	public static void main(String[] args) {
		// code to run the program
		DataCtrl data = new DataCtrl();
		
//		data.setup();
		
		data.read();
		
		data.exit();
	}
	
}
