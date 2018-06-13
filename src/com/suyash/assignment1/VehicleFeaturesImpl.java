package com.suyash.assignment1;

public class VehicleFeaturesImpl  implements VehicleFeatures{

	@Override
	public void breakType(String mBreakType) {
		System.out.println(mBreakType);
	}

	@Override
	public void fuelType(String mFuelType) {
		System.out.println(mFuelType);
	}

	@Override
	public void fuelType(int mFuelCapacity) {
		if(mFuelCapacity > 20)
			System.out.println("Type A");
		else
			System.out.println("type B");
	}
	

}
