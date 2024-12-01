package com.xworkz.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="food-details")
public class FoodDetailsEntity {
	

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Id
	private String foodName;
	
	private int price;
	
	private int quantity;
}
