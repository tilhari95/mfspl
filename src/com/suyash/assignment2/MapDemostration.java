package com.suyash.assignment2;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemostration {
	public static void main(String args[]) {
		HashMap<String,Integer> vehicleRegistration= new HashMap<String, Integer>();
		vehicleRegistration.put("Car",  	112211);
		vehicleRegistration.put("Bus",  	112212);
		vehicleRegistration.put("Jeep", 	112213);
		vehicleRegistration.put("Truck",	112214);
		
		for ( Entry<String, Integer> entry: vehicleRegistration.entrySet()) {
			System.out.println("Vehicle type: " + entry.getKey() + " Vehicle reg : " + entry.getValue());
		}
		
		
	}

}
