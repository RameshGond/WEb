package com.xworkz.coffee;

import java.util.HashSet;
import java.util.Set;

import com.xworkz.coffee.dto.CoffeeDTO;

public class CoffeeRunner {

	public static void main(String[] args) {
		CoffeeDTO coffeeDTO1 = new CoffeeDTO("Black Coffee", 899D, 100D, 5D, "Weight Loss");
		CoffeeDTO coffeeDTO2 = new CoffeeDTO("Arabica", 850D, 500D, 4D, "Cancer prevention");
		CoffeeDTO coffeeDTO3 = new CoffeeDTO("Cold Coffee", 299D, 100D, 5D, "Gastric Issues");
		CoffeeDTO coffeeDTO4 = new CoffeeDTO("Cafe Latte", 999D, 400D, 5D, "Skin Glow");
		CoffeeDTO coffeeDTO5 = new CoffeeDTO("Americano", 399D, 100D, 5D, "weight loss");

		Set<CoffeeDTO> coffee = new HashSet<CoffeeDTO>();
		coffee.add(coffeeDTO1);
		coffee.add(coffeeDTO2);
		coffee.add(coffeeDTO3);
		coffee.add(coffeeDTO4);
		coffee.add(coffeeDTO5);

		coffee.forEach(System.out::println);

	}

}
