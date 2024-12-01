package com.xworkz.repo;

import javax.persistence.EntityManager;

import com.xworkz.entity.FoodDetailsEntity;

import com.xworkz.util.FoodUtil;

public class FoodDetailsRepoImpl implements FoodDetailsRepo {

	FoodUtil util=new FoodUtil();
	@Override
	public void onsave(FoodDetailsEntity entity) {
		EntityManager manag=util.getManager();
		manag.getTransaction().begin();
		manag.persist(entity);
		manag.getTransaction().commit();
		manag.close();
		
	}

	@Override
	public FoodDetailsEntity findByfoodName(String f_name) {
		EntityManager manag=util.getManager();
		return manag.find(FoodDetailsEntity.class, f_name);
	}

}
