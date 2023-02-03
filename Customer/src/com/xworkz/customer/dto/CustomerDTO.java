package com.xworkz.customer.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.xworkz.constants.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO implements Serializable {
	
	private Integer id;
	private String name;
	private String email;
	private LocalDate dob;
	private Gender gender;
	private String occupation;
	private AddressDTO addressDTO;

}
