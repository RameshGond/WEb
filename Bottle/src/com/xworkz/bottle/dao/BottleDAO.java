package com.xworkz.bottle.dao;

import com.xworkz.bottle.dto.BottleDTO;
import com.xworkz.bottle.exception.OutOfStockException;

public class BottleDAO {
	
	private BottleDTO[] dtos=new BottleDTO[5];
	private int index;
	
	public boolean save(BottleDTO dto)
	{
		if(this.index < this.dtos.length)
		{
			this.dtos[index]=dto;
			index++;
			System.out.println("new bottle added " + dto + " at index " + index);
			return true;
		}
		else
		{
			System.err.println("bottle is out of index");
			OutOfStockException stock=new OutOfStockException("space not available");
			throw stock;
		}
	}
	
}
