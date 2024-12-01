package com.xworkz.repository;

import com.xworkz.entity.FoodDetailsEntity;

public interface FoodDetailsRepo {

	public void onsave(FoodDetailsEntity entity);
	FoodDetailsEntity findByfood(String foodName);
}
