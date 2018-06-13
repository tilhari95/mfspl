package com.suyash.assignment1;

public class Vehicle {
	
	private String vehicleName;
	private String vehicleType;
	private int vehicleNo;
	
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public Vehicle(String vehicleName, String vehicleType, int vehicleNo) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleType = vehicleType;
		this.vehicleNo = vehicleNo;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
