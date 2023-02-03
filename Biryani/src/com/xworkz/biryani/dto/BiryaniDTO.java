package com.xworkz.biryani.dto;



import com.xworkz.biryani.constants.Quantity;
import com.xworkz.biryani.constants.Type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public class BiryaniDTO {
	
	private Type type;
	private Double price;
	private Quantity quantity;
	private String[] ingredients;
	private String color;
	private boolean kushka, veg;

}
