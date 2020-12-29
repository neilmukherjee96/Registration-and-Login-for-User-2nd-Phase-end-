package com.util;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.User;
import com.servlet.Registration;

public class HibernateUtil {
	private static SessionFactory sf;
	static {

		sf = new Configuration().addAnnotatedClass(User.class).configure().buildSessionFactory();

	}

	public static SessionFactory getSessionFactory() {
		return sf;
	}

}
