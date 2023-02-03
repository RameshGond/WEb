package com.xworkz.association.fw.beans;

public class CapBean {
	private double price;

	public CapBean(double price) {
		this.price = price;
		System.out.println("created capBean " + this.getClass().getSimpleName());

	}

	public void protect() {
		System.out.println("protect the bottle using cap" + this.price);

	}

	@Override
	public String toString() {

		return "CapBean[price=" + price + "]";
	}

}
