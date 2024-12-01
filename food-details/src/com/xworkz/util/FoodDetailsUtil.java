package com.xworkz.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FoodDetailsUtil {

	
		public EntityManager getManager() {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("com.xworkz");
			
			return factory.createEntityManager();
			
		}
}

