//BikeFactory.java
package com.nt.factory;

import com.nt.comp.Bike;
import com.nt.comp.BulletBike;
import com.nt.comp.ElectricBike;
import com.nt.comp.SportsBike;
import com.nt.comp.StandardBike;

public class BikeFactory {
	//static factory method having factory pattern logic
	public static Bike orderBike(String type) {
		Bike bike = null;
		if(type.equalsIgnoreCase("standard"))
			bike = new StandardBike();
		else if(type.equalsIgnoreCase("sports"))
			bike = new SportsBike();
		else if(type.equalsIgnoreCase("electric"))
			bike = new ElectricBike();
		else if(type.equalsIgnoreCase("bullet"))
			bike = new BulletBike();
		else 
			throw new IllegalArgumentException("invalid bike type");
		return bike;
	}
}
