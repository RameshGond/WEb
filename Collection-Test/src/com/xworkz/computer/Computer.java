package com.xworkz.computer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Computer {

	public static void main(String[] args) {
		Collection<String> collection = new ArrayList<String>();
		collection.add("HP");
		collection.add("Lenovo");
		collection.add("Dell");
		collection.add("apple");
		collection.add("Acer");
		collection.add("ASUS");
		collection.add("Microsoft");
		collection.add("Toshiba");
		collection.add("Samsung");
		collection.add("MSI");

		System.out.println("************************ Display all brands*********************");
		collection.forEach(System.out::println);

		System.out.println("*********Find All brand with length greater than 4**********");
		List<String> temp = collection.stream().filter(r -> r.length() > 4).collect(Collectors.toList());
		temp.forEach(System.out::println);

		System.out.println("********* Display all brands in upper case******************");
		List<String> temp1 = collection.stream().map(String::toUpperCase).collect(Collectors.toList());
		temp1.forEach(System.out::println);

	}

}
