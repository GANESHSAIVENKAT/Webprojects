package com.xworkz.repo;

import com.xworkz.entity.FoodDetailsEntity;

public interface FoodDetailsRepo {

	public void onsave(FoodDetailsEntity entity);
	FoodDetailsEntity findByfoodName(String f_name);
}
