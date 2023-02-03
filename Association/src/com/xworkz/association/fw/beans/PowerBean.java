package com.xworkz.association.fw.beans;

public class PowerBean {
	private String typeOfPower;

	public PowerBean(String typeOfPower) {
		this.typeOfPower = typeOfPower;
		System.out.println("created powerBean " + this.getClass().getSimpleName());
	}
	public void conection() {
		System.out.println("connection the system using power "+this.typeOfPower);
		
	}

	@Override
	public String toString() {
		return "typeOfPower=" + typeOfPower + "";
	}

}
