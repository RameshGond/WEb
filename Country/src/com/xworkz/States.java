package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class States {

	public static void main(String[] args) {
		List<String> states = new ArrayList<String>();
		states.add("Bihar");
		states.add("Goa");
		states.add("Tamli nadu");
		states.add("Gujrat");
		states.add("Assam");
		states.add("Karnatka");
		states.add("Maharastra");
		states.add("Madhya Pradesh");
		states.add("Utrakhand");
		states.add("Andhra Pradesh");

		System.out.println("****Sort in Ascending Order****");
		List<String> temp = states.stream().sorted().collect(Collectors.toList());
		temp.forEach(System.out::println);

		System.out.println("**** Sort in Descending Order****");

		List<String> temp1 = states.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
		temp1.forEach(System.out::println);

	}

}
