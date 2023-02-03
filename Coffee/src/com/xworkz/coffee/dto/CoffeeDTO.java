package com.xworkz.coffee.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CoffeeDTO implements Serializable, Comparable<CoffeeDTO> {
	private String name;
	private Double price;
	private Double weight;
	private Double rating;
	private String usefulFor;

	@Override
	public int compareTo(CoffeeDTO o) {
		if (o != null && o.getName() != null) {
			System.out.println("comparing objects");
		}
		return this.name.compareTo(o.getName());
	}

	@Override
	public int hashCode() {
		System.out.println("running hash code");
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			System.out.println("object is not null,can be compare");
			CoffeeDTO patel = (CoffeeDTO) obj;
			if (this.name.equals(patel.getName())) {
				System.out.println("object is equals");
			}
			return true;
		}
		return super.equals(obj);
	}

}
