package com.xworkz.cake.dto;
import java.io.Serializable;

import com.xworkz.cake.Flavour;
import com.xworkz.cake.Shape;
import com.xworkz.cake.Type;
public class CakeDTO {
	private Integer id;
	private Double price;
	private Float quantity;
	private Flavour flavour;
	private Shape shape;
	private Type type;

	
	public CakeDTO()
	{
		System.out.println("cake dto no args");
	}
	public String toString()
	{
		return "Cake";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Float getQuantity() {
		return quantity;
	}
	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}
	public Flavour getFlavour() {
		return flavour;
	}
	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	
	
	
}
