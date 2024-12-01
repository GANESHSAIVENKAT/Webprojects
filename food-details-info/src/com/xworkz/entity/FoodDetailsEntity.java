package com.xworkz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="food_details")
public class FoodDetailsEntity {
	   @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id; 
	    
	  @Id
	    private String f_name; 
	    private int f_price; 
	    private int f_quantity;
}
