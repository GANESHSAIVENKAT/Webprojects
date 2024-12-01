package com.xworkz.runner;

import com.xworkz.entity.FoodDetailsEntity;
import com.xworkz.repo.FoodDetailsRepo;
import com.xworkz.repo.FoodDetailsRepoImpl;
import com.xworkz.service.FoodDetailsService;
import com.xworkz.service.FoodDetailsServiceImpl;


public class FoodDetailsRunner {

	public static void main(String[] args) {
		FoodDetailsEntity entity = new FoodDetailsEntity();
		entity.setF_name("Biriyani");
		entity.setF_price(120);
		entity.setF_quantity(200);
		
		FoodDetailsEntity entity1 = new FoodDetailsEntity();
		entity1.setF_name("Gobirice");
		entity1.setF_price(120);
		entity1.setF_quantity(300);

		FoodDetailsRepo repo = new FoodDetailsRepoImpl();
		
		FoodDetailsService service = new FoodDetailsServiceImpl(repo);
		
//		service.onsave(entity);
//		service.onsave(entity1);

		System.out.println(service.findByf_name("Gobirice"));
	}

}
