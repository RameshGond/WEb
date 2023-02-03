package com.xworkz.customer;

import java.time.LocalDate;

import com.xworkz.constants.Gender;
import com.xworkz.customer.dao.CustomerDAO;
import com.xworkz.customer.dao.CustomerDAOImpl;
import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.exception.InvalidDataException;
import com.xworkz.customer.service.CustomerService;
import com.xworkz.customer.service.CustomerServiceImpl;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class CustomerServiceRunner {

	public static void main(String[] args) throws InvalidDataException {
		
		CustomerDAO dao = new CustomerDAOImpl();
		CustomerService service = new CustomerServiceImpl(dao);

		Address address1 = new Address(1, "9th cross", "bengaluru", 45, "khb colony");
		CustomerDTO dto1 = new CustomerDTO(1, "Ravi", "ravi511@gmail.com", LocalDate.of(1995, 05, 22), Gender.MALE,
				"farmer", address1);

		Address address2 = new Address(2, "8th cross", "Mangaluru", 38, "arehalli colony");
		CustomerDTO dto2 = new CustomerDTO(2, "Raju", "Raju11@gmail.com", LocalDate.of(1994, 05, 22), Gender.MALE,
				"accounted", address2);

		Address address3 = new Address(3, "19th cross", "bengaluru", 45, "khb colony");
		CustomerDTO dto3 = new CustomerDTO(3, "Shiva", "shiva1411@gmail.com", LocalDate.of(1995, 04, 06), Gender.MALE,
				"field worker", address3);

		Address address4 = new Address(4, "9th cross", "bengaluru", 32, "btm layout");
		CustomerDTO dto4 = new CustomerDTO(4, "Samudra", "samudra564@gmail.com", LocalDate.of(1988, 06, 22),
				Gender.MALE, "doctor", address4);

		Address address5 = new Address(5, "12th cross", "bengaluru", 22, "vijay nagar");
		CustomerDTO dto5 = new CustomerDTO(5, "Anusha", "Anusha56@gmail.com", LocalDate.of(1997, 05, 22), Gender.FEMALE,
				"scientist", address5);

		Address address6 = new Address(6, "2nd cross", "Ramnagar", 45, "Anchepalya");
		CustomerDTO dto6 = new CustomerDTO(6, "Samar", "samar156@gmail.com", LocalDate.of(1992, 05, 22), Gender.MALE,
				"developer", address6);

		Address address7 = new Address(7, "9th cross", "bengaluru", 45, "khb colony");
		CustomerDTO dto7 = new CustomerDTO(7, "Ravi", "ravi11@gmail.com", LocalDate.of(1995, 05, 22), Gender.MALE,
				"farmer", address7);

		Address address8 = new Address(8, "9th cross", "bengaluru", 45, "khb colony");
		CustomerDTO dto8 = new CustomerDTO(8, "Ravi", "ravi11@gmail.com", LocalDate.of(1995, 05, 22), Gender.MALE,
				"farmer", address8);

		Address address9 = new Address(9, "9th cross", "bengaluru", 45, "khb colony");
		CustomerDTO dto9 = new CustomerDTO(9, "Ravi", "ravi11@gmail.com", LocalDate.of(1995, 05, 22), Gender.MALE,
				"farmer", address9);
		try {
			boolean saved = service.ValidateAndSave(dto1, address1);
			System.out.println(saved);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			saved = service.ValidateAndSave(dto2, address2);
			System.out.println(saved);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			saved = service.ValidateAndSave(dto3, address3);
			System.out.println(saved);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			saved = service.ValidateAndSave(dto4, address4);
			System.out.println(saved);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			saved = service.ValidateAndSave(dto5, address5);
			System.out.println(saved);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			saved = service.ValidateAndSave(dto6, address6);
			System.out.println(saved);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			saved = service.ValidateAndSave(dto7, address7);
			System.out.println(saved);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			saved = service.ValidateAndSave(dto8, address8);
			System.out.println(saved);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			saved = service.ValidateAndSave(dto9, address9);
			System.out.println(saved);
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		} catch (InvalidDataException e) {
			e.printStackTrace();
		}

	}
}
