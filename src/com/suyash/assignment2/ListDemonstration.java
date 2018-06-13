package com.suyash.assignment2;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListDemonstration {
	public static void main(String args[]) {
		ArrayList<String> vehicleName=new ArrayList<String>();  
		vehicleName.add("car");  
		vehicleName.add("bus");  
		vehicleName.add("bike");
		vehicleName.add("auto");
		vehicleName.add("truck");
		ListIterator<String> itr=vehicleName.listIterator();  
		System.out.println("traversing elements of list...");  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}  
} 