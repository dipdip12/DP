package com.dp.creational.factory;

public class VehicleFactory {

	public static Vehicle getVehicle(String type,String sc,String tyres,boolean dl){
		Vehicle v=null;
		if(type.equalsIgnoreCase("Car"))
			v= new Car(sc, tyres, dl);
		else if(type.equalsIgnoreCase("Truck"))
			v= new Truck(sc, tyres, dl);
		else if(type.equalsIgnoreCase("Cycle"))
			v=new Cycle(sc, tyres, dl);
		return v;
	}
}
