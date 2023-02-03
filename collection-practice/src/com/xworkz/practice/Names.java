package com.xworkz.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Names {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("rahul");
		name.add("satya");
		name.add("kunal");
		name.add("rahul");
		name.add("ritam");
		
		// System.out.println(name);
		Iterator temp = name.iterator();
		while (temp.hasNext()) {

			System.out.println(temp.next());
		}

	}

}
