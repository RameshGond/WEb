package com.xworkz.customer.dao;

import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.exception.IndexIsFullException;

public class CustomerDAOImpl implements CustomerDAO {
	private CustomerDTO[] dtos = new CustomerDTO[TOTAL_SIZE];
	private int index;
	@Override
	public boolean Save(CustomerDTO dto) {
		if (this.index < this.dtos.length) {
			System.out.println("storing dtos "+dto);
			this.dtos[index]=dto;
			this.index++;
			return true;
		} else {
			IndexIsFullException full = new IndexIsFullException("can not add more as the index is full");
			throw full;
		}
	}
}
