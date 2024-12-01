package com.xworkz.service;

import com.xworkz.entity.FoodDetailsEntity;
import com.xworkz.repo.FoodDetailsRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class FoodDetailsServiceImpl implements FoodDetailsService {

	private FoodDetailsRepo repo;
	@Override
	public void onsave(FoodDetailsEntity entity) {
		
		repo.onsave(entity);
	}
	@Override
	public FoodDetailsEntity findByf_name(String f_name) {
		
		return repo.findByfoodName(f_name);
	}

}
