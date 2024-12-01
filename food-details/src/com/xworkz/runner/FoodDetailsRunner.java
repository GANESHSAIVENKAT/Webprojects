package com.xworkz.runner;

import com.xworkz.entity.FoodDetailsEntity;
import com.xworkz.repository.FoodDetailsRepo;
import com.xworkz.repository.FoodDetailsRepoImpl;
import com.xworkz.service.FoodDetailsService;
import com.xworkz.service.FoodDetailsServiceImpl;

public class FoodDetailsRunner {

	public static void main(String[] args) {
		
		FoodDetailsEntity entity = new FoodDetailsEntity();
		entity.setFoodName("Biriyani");
		entity.setPrice(250);
		entity.setQuantity(400);
	
		
		FoodDetailsEntity entity1 = new FoodDetailsEntity();
		entity1.setFoodName("GobiRice");
		entity1.setPrice(250);
		entity1.setQuantity(500);
		
		FoodDetailsRepo repo = new FoodDetailsRepoImpl();
		
		FoodDetailsService service = new FoodDetailsServiceImpl(repo);
		
	
	service.onsave(entity);
		
//		System.out.println(service.findByuserId("Biriyani"));
	}
}
