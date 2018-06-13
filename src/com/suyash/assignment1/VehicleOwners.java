package com.suyash.assignment1;

public class VehicleOwners  extends Vehicle implements VehicleFeatures{
	private String ownerName;
	private String ownerAddress;
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerAddress() {
		return ownerAddress;
	}
	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}
	public VehicleOwners(String vehicleName, String vehicleType, int vehicleNo, String ownerName, String ownerAddress) {
		super(vehicleName, vehicleType, vehicleNo);
		this.ownerName = ownerName;
		this.ownerAddress = ownerAddress;
	}
	@Override
	public void breakType(String mBreakType) {
		// TODO customized implementation
		
	}
	@Override
	public void fuelType(String mFuelType) {
		// TODO customized implementation
		
	}
	@Override
	public void fuelType(int mFuelCapacity) {
		// TODO customized implementation
	}
	
	
}
