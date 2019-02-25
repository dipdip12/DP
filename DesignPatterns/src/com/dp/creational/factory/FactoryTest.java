package com.dp.creational.factory;

public class FactoryTest {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getVehicle("Car", "4", "4",true);
		Vehicle truck = VehicleFactory.getVehicle("Truck", "6", "8",true);
		Vehicle bicycle = VehicleFactory.getVehicle("Cycle", "1", "2",false);
		System.out.println(car.printVehicle());
		System.out.println(truck.printVehicle());
		System.out.println(bicycle.printVehicle());
	}

}
