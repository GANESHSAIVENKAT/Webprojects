package com.xworkz.service;

import com.xworkz.entity.FoodDetailsEntity;
import com.xworkz.repository.FoodDetailsRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class FoodDetailsServiceImpl implements FoodDetailsService {
private FoodDetailsRepo repo;
	@Override
	public void onsave(FoodDetailsEntity entity) {
		repo.onsave(entity);
		
	}
	@Override
	public FoodDetailsEntity findByFoodName(String foodName) {
		
		return repo.findByfood(foodName);
	}




}
