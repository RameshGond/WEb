package com.xworkz.customer.dao;

import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.exception.InvalidDataException;

public interface CustomerDAO {
	int TOTAL_SIZE = 10;

	boolean Save(CustomerDTO dto);

}
