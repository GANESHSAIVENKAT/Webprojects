package com.xworkz.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FoodUtil {

	public EntityManager getManager() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
		
		return factory.createEntityManager();
		
	}
}
