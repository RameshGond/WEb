package com.xworkz.biryani.api;

import java.util.ArrayList;
import java.util.Collection;

import java.util.Iterator;

import com.xworkz.biryani.constants.Quantity;
import com.xworkz.biryani.constants.Type;
import com.xworkz.biryani.dto.BiryaniDTO;

public class BiryaniRunner {

	public static void main(String[] args) {

		BiryaniDTO biryaniDTO = new BiryaniDTO();
		biryaniDTO.setColor("WHITE");
		biryaniDTO.setPrice(299D);
		biryaniDTO.setKushka(false);
		biryaniDTO.setType(Type.MUTTON);
		biryaniDTO.setQuantity(Quantity.FULL);
		biryaniDTO.setVeg(false);

		String[] items = { "mutton", "rice", "oil", "onion", "chilli", "garam masala", "salt", "garlic", "kotmari",
				"coconut", "ghee" };
		biryaniDTO.setIngredients(items);

		Collection<BiryaniDTO> biryaniDTOs = new ArrayList<>();
		biryaniDTOs.add(biryaniDTO);

		Iterator<BiryaniDTO> itr = biryaniDTOs.iterator();
		while (itr.hasNext()) {
			BiryaniDTO temp = itr.next();
			System.out.println(temp);

			System.out.println("***********************************");
		}
		String[] eggItems = new String[items.length];
		System.arraycopy(items, 0, eggItems, 0, items.length);
		eggItems[0] = "Egg";
		BiryaniDTO biryaniDTO2 = new BiryaniDTO(Type.EGG, 150D, Quantity.FULL, eggItems, "green", false, false);
		System.out.println(biryaniDTO2);
		System.out.println("********************************************");
		
		String[] fishItems = new String[items.length];
		System.arraycopy(items, 0, fishItems, 0, items.length);
		fishItems[0] = "FISH";
		BiryaniDTO biryaniDTO3 = new BiryaniDTO(Type.FISH, 250D, Quantity.HALF, fishItems, "green", false, false);
		System.out.println(biryaniDTO3);
		System.out.println("********************************************");
	}
}
