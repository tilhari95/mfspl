package com.suyash.assignment1;

public class Test {
	public static void main(String args[]) {
		VehicleOwners owner1=new VehicleOwners("Car", "SUV", 11223345, "Suyash", "Noida");
		System.out.println(owner1.getVehicleName() + "  " + owner1.getOwnerAddress());
		VehicleFeaturesImpl defaultImpl = new VehicleFeaturesImpl();
		defaultImpl.breakType("Disc brake");
		defaultImpl.fuelType("Diesel");
	}

}
