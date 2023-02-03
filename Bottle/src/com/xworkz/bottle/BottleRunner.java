package com.xworkz.bottle;

import com.xworkz.bottle.constants.Material;
import com.xworkz.bottle.dao.BottleDAO;
import com.xworkz.bottle.dto.BottleDTO;

public class BottleRunner {

	public static void main(String[] args) {
		
		BottleDTO bottle=new BottleDTO();
		bottle.setBrand("cello");
		bottle.setColor("black");
		bottle.setQuantity(23);
		bottle.setPrice(60.0);
		bottle.setMaterial(Material.ALUMINUM);
		
		BottleDAO dao=new BottleDAO();
		boolean save=dao.save(bottle);
		System.out.println(save);
		
		BottleDTO bottle1=new BottleDTO();
		bottle1.setBrand("ritam");
		bottle1.setColor("blue");
		bottle1.setQuantity(19);
		bottle1.setPrice(70.0);
		bottle1.setMaterial(Material.IRON);
		
		save=dao.save(bottle1);
		System.out.println(save);
		
		BottleDTO bottle2=new BottleDTO();
		bottle2.setBrand("sapna");
		bottle2.setColor("pink");
		bottle2.setQuantity(54);
		bottle2.setPrice(160.0);
		bottle2.setMaterial(Material.PLASTIC);
		
		save=dao.save(bottle2);
		System.out.println(save);
		
		BottleDTO bottle3=new BottleDTO();
		bottle3.setBrand("apna");
		bottle3.setColor("yellow");
		bottle3.setQuantity(109);
		bottle3.setPrice(99.0);
		bottle3.setMaterial(Material.ALUMINUM);
		
		save=dao.save(bottle3);
		System.out.println(save);
		
		BottleDTO bottle4=new BottleDTO();
		bottle4.setBrand("payal");
		bottle4.setColor("red");
		bottle4.setQuantity(47);
		bottle4.setPrice(69.0);
		bottle4.setMaterial(Material.STEEL);
		
		save=dao.save(bottle4);
		System.out.println(save);
		
		BottleDTO bottle5=new BottleDTO();
		bottle5.setBrand("xworkz");
		bottle5.setColor("green");
		bottle5.setQuantity(87);
		bottle5.setPrice(160.0);
		bottle5.setMaterial(Material.PLASTIC);
		
		save=dao.save(bottle5);
		System.out.println(save);

	}

}
