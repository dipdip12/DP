package com.dp.creational.factory;

public class Car implements Vehicle {

	private String seatingCapacity;
	private String tyres;
	private boolean licenseRequired;
	
	
	public Car(String seatingCapacity, String tyres, boolean licenseRequired) {
		super();
		this.seatingCapacity = seatingCapacity;
		this.tyres = tyres;
		this.licenseRequired = licenseRequired;
	}

	@Override
	public String getSeatingCapacity() {
		return seatingCapacity;
	}

	@Override
	public String getTyresCount() {
		return tyres;
	}

	@Override
	public boolean licenseRequired() {
		return licenseRequired;
	}

}
