package com.dp.creational.factory;

public interface Vehicle {

	public String getSeatingCapacity();
	public String getTyresCount();
	public boolean licenseRequired();
	public default String printVehicle(){
		return "SeatingCapacity:"+getSeatingCapacity()+" Tyres:"+getTyresCount()+" LicenseReq:"+licenseRequired();
	}
}
