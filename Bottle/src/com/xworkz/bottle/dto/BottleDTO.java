package com.xworkz.bottle.dto;

import java.io.Serializable;

import com.xworkz.bottle.constants.Material;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BottleDTO implements Serializable {
	
	private String brand;
	private String color;
	private Integer quantity;
	private Double price;
	private Material material;
	
	public BottleDTO()
	{
		System.out.println("Bottle dto no args");
	}
	
	

	

}
