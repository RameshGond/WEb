package com.xworkz.cake.dao;

import com.xworkz.cake.Flavour;
import com.xworkz.cake.Shape;
import com.xworkz.cake.Type;
import com.xworkz.cake.dto.CakeDTO;

public class CakeDAO {
	private CakeDTO[] dtos = new CakeDTO[5];
	private int index;

	public boolean save(CakeDTO dto) {
		System.out.println("Storing " + dto);
		if (index < this.dtos.length) {
			this.dtos[index] = dto;
			index++;

			System.out.println("New Cake Added ");
			return true;
		} 
		else {
			System.out.println("Array out of Index");
		}
		return false;

	}

	public void updatePriceByFlavour(Double priceToUpdate, Flavour flavour) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto=dtos[index];
			
			System.out.println("Flavour is " + flavour);
			if (dto.getFlavour().equals(flavour)) {
				dto.setPrice(priceToUpdate);
				System.out.println("Updated Price " + priceToUpdate);
				break;
			} 
			else {
				System.out.println("Price Cannot Be Updated For The Given Flavour");
			}
		}
	}

	public void updatePriceAndQuantityByFlavour(Double priceToUpdate, Float quantityToUpdate, Flavour flavour) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto2=dtos[index];
		
			System.out.println("Flavour is " + flavour);
			System.out.println("Existing Favour is "+dto2.getFlavour());
			if (dto2.getFlavour().equals(flavour)) {
				dto2.setPrice(priceToUpdate);
				dto2.setQuantity(quantityToUpdate);
				System.out.println("Updated Price " + priceToUpdate);
				System.out.println("Updated Quantity " + quantityToUpdate);
				break;
			} 
			else {
				System.out.println("Price Cannot Be Updated For The Given Flavour");
			}
		}
	}

	public void updateShapeById(Shape shapeToUpdate, Integer id) {
		for (int index= 0; index< this.dtos.length; index++) {
			CakeDTO dto3=dtos[index];
			System.out.println("Id is " + id);
			if (dto3.getId().equals(id)) {
				dto3.setShape(shapeToUpdate);
				System.out.println("Updated Shape " + shapeToUpdate);
				break;
			} 
			else {
				System.out.println("Shape Cannot be Updated By Id");
			}
		}
	}
	
	public void updateTypeByIdAndFlavour(Type typeToUpdate, Integer id, Flavour flavour) {
		for (int index = 0; index< this.dtos.length; index++) {
		
			System.out.println("Flavour is " + flavour);
			System.out.println("Existing Favour is "+ dtos[index].getFlavour());
			if (dtos[index].getFlavour().equals(flavour)&&dtos[index].getId().equals(id)) {
				dtos[index].setType(typeToUpdate);
				System.out.println("Updated Type " +typeToUpdate);
				break;
			} 
			else {
				System.out.println("Price Cannor Be Updated For The Given Flavour");
			}
		}
	}
	public void updatePriceAndShapeAndTypeByQuantity(Double priceToUpdate, Shape shapeToUpdate, Type typeToUpdate,Float quantity) {
		for (int index = 0; index < this.dtos.length; index++) {
			CakeDTO dto5=dtos[index];
		
			System.out.println("Quantity is " + quantity );
			if (dto5.getQuantity().equals(quantity)) {
				dto5.setPrice(priceToUpdate);
				dto5.setShape(shapeToUpdate);
				dto5.setType(typeToUpdate);
				System.out.println("Updated Price " + priceToUpdate);
				System.out.println("Updated Shape " + shapeToUpdate);
				System.out.println("Updated Type "+typeToUpdate);
				break;
			} 
			else {
				System.out.println("Price Cannot Be Updated For The Given Flavour");
			}
		}
	}
	
	//findDurationByName

		
	
	
}
	
	