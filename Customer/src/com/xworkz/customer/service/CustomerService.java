package com.xworkz.customer.service;

import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.exception.InvalidDataException;

public interface CustomerService {
	boolean ValidateAndSave(CustomerDTO dto,AddressDTO add) throws InvalidDataException;
	

}
