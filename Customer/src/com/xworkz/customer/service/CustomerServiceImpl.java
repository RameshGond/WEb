package com.xworkz.customer.service;

import java.time.LocalDate;

import com.xworkz.constants.Gender;
import com.xworkz.customer.dao.CustomerDAO;
import com.xworkz.customer.dto.AddressDTO;
import com.xworkz.customer.dto.CustomerDTO;
import com.xworkz.customer.exception.InvalidDataException;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO stom;

	@Override
	public boolean ValidateAndSave(CustomerDTO dto, AddressDTO add) throws InvalidDataException {
		if (dto != null) {
			Integer id = dto.getId();
			if (id != null && id > 0) {
				// System.out.println("id is valid");
			} else {
				System.err.println("id is invalid");
				throw new InvalidDataException("dto is invalid");

			}
			String name = dto.getName();
			for (int j = 0; j < name.length(); j++) {
				if (name != null && name.length() > 3 && name.length() < 20 && !Character.isDigit(name.charAt(j))) {
					// System.out.println("name is valid ");
				} else {
					System.err.println("name is invalid ");
					throw new InvalidDataException("dto is invalid");

				}
			}

			String email = dto.getEmail();
			for (int i = 0; i < email.length(); i++) {
				if (email != null && email.length() > 3 && name.length() < 30) {
					// System.out.println("email is valid");
				} else {
					System.err.println("email is invalid");
					throw new InvalidDataException("dto is invalid");

				}
			}

			LocalDate dob = dto.getDob();
			if (dob != null) {
				// System.out.println("dob is valid ");
			} else {
				System.err.println("dob is invalid");
				throw new InvalidDataException("dto is invalid");

			}

			Gender gender = dto.getGender();
			if (gender != null) {
				// System.out.println("gender is valid");
			} else {
				System.err.println("gender is invalid");
				throw new InvalidDataException("dto is invalid");
			}

			String occupation = dto.getOccupation();
			for (int k = 0; k < occupation.length(); k++) {
				if (occupation != null && occupation.length() > 3 && occupation.length() < 30
						&& !Character.isDigit(occupation.charAt(k))) {
					// System.out.println("occupation is valid ");
				} else {
					System.err.println("occupation is invalid");
					throw new InvalidDataException("dto is invalid");

				}
			}

			AddressDTO addressDTO = dto.getAddressDTO();
			if (addressDTO != null) {
				// System.out.println("addressdto is valid");
			} else {
				System.err.println("addressdto is invalid");
				throw new InvalidDataException("dto is invalid");

			}

			Integer id1 = add.getId();
			if (id1 != null && id1 > 0) {
				// System.out.println("id1 is valid");
			} else {
				System.err.println("id1 is invalid");
				throw new InvalidDataException("dto is invalid");

			}

			String street = add.getStreet();
			for (int a = 0; a < street.length(); a++) {
				if (street != null && street.length() > 3 && street.length() < 30) {
					// System.out.println("street is valid");
				} else {
					System.err.println("street is invalid");
					throw new InvalidDataException("dto is invalid");

				}
			}

			String city = add.getCity();
			for (int l = 0; l < city.length(); l++) {
				if (city != null && city.length() > 3 && city.length() < 30) {
					// System.out.println("city is valid");
				} else {
					System.err.println("city is invalid");
					throw new InvalidDataException("dto is invalid");

				}
			}

			Integer no = add.getNo();
			if (no != null && no > 0) {
				// System.out.println("no is valid");
			} else {
				System.err.println("no is valid");
				throw new InvalidDataException("dto is invalid");

			}

			String landmark = add.getLandmark();
			for (int v = 0; v < landmark.length(); v++) {
				if (landmark != null && landmark.length() > 3 && landmark.length() < 30) {
					// System.out.println("landmark is valid");
				} else {
					System.err.println("landmark is invalid");
					throw new InvalidDataException("dto is invalid");

				}
			}

			// return this.stom.save(dto);
			boolean saved = stom.Save(dto);
			System.out.println(saved);
			return true;
		} else {
			System.err.println("DTO founf Null and File is Not Saved");
			throw new InvalidDataException("the value added is invalid, please add new value");
		}

	}
}
