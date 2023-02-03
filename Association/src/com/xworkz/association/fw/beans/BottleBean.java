package com.xworkz.association.fw.beans;

public class BottleBean {
	private String name;
	private CapBean cap;

	public BottleBean(String name) {
		this.name = name;
		System.out.println("created bottleBean " + this.getClass().getSimpleName());
	}

	public void setCap(CapBean cap) {
		this.cap = cap;

	}

	@Override
	public String toString() {

		return "CapBean [name=" + name + ",cap=" + cap + "]";
	}
}
