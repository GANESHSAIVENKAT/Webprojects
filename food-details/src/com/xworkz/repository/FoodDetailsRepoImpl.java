package com.xworkz.repository;

import javax.persistence.EntityManager;

import com.xworkz.entity.FoodDetailsEntity;
import com.xworkz.util.FoodDetailsUtil;

public class FoodDetailsRepoImpl implements FoodDetailsRepo {

	FoodDetailsUtil util=new FoodDetailsUtil();
	@Override
	public void onsave(FoodDetailsEntity entity) {
		EntityManager manag=util.getManager();
		manag.getTransaction().begin();
		
		manag.persist(entity);
		manag.getTransaction().commit();
		manag.close();
	}

	@Override
	public FoodDetailsEntity findByfood(String foodName) {
		EntityManager manag=util.getManager();
		return manag.find(FoodDetailsEntity.class, foodName);
	}

}
