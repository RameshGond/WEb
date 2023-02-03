package com.xworkz.association.fw.beans;

public class SystemBean {
	private String typeOfSystem;
	private PowerBean powerBean;
	
	public SystemBean(String typeOfSystem,PowerBean powerBean ) {
		this.typeOfSystem=typeOfSystem;
		this.powerBean=powerBean;
		System.out.println("Created SystemBean "+this.getClass().getSimpleName());
	}
	

	@Override
	public String toString() {
		return "SystemBean [typeOfSystem=" + typeOfSystem + ", " + powerBean + "]";
	}


}
