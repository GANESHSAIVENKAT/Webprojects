package com.xworkz.service;

import com.xworkz.entity.FoodDetailsEntity;

public interface FoodDetailsService {

	public void onsave(FoodDetailsEntity entity);
	FoodDetailsEntity findByf_name(String f_name);
}
