package com.jspider.KycAPP.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SingleTonUtil {
	
	private static SessionFactory sessionFactory =null;

	private SingleTonUtil() {}
	
	public static SessionFactory getSession()
	{
		if(sessionFactory==null)
		{
			Configuration configuration = new Configuration();
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();	
		}
		return sessionFactory;	
	}
}
