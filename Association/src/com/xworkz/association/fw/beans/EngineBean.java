package com.xworkz.association.fw.beans;

public class EngineBean {
	private double speed;

	public EngineBean(double speed) {
		this.speed = speed;
		System.out.println("double parameter" + this.getClass().getSimpleName());
	}

	public void running() {
		System.out.println("Running the train using engine" + this.speed);
	}

	@Override
	public String toString() {
		return "EngineBean [speed=" + speed + "]";
	}

}
