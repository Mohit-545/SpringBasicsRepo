//FactoryPatternTest.java	
package com.nt.test;

import com.nt.comp.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Bike bike = BikeFactory.orderBike("standard");
		bike.drive();
	
		System.out.println("------------------------------------------------------------");
		Bike bike1 = BikeFactory.orderBike("electric");
		bike1.drive();
		
		System.out.println("------------------------------------------------------------");
		Bike bike2 = BikeFactory.orderBike("sports");
		bike2.drive();
		
		System.out.println("------------------------------------------------------------");
		Bike bike3 = BikeFactory.orderBike("bullet");
		bike3.drive();
	}//main

}//class
