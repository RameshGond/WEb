package com.xworkz.association.fw.beans;

public class TrainBean {
	private String name;
	private EngineBean engine;

	public TrainBean(String name) {
		this.name = name;
		System.out.println("int parameter" + this.getClass().getSimpleName());
	}

	public void setEngine(EngineBean engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "TrainBean [name=" + name + ", engine=" + engine + "]";
	}

}
