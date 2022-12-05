//FlipkartFactory.java (Factory Pattern)
package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipkart;

public class FlipkartFactory {
	//static factory method having factory patten logic
	public static Flipkart getInstance(String CourierType) {
		 //create Dependent class obj
		Courier courier = null;
		if(CourierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if(CourierType.equalsIgnoreCase("blueDart"))
			courier = new BlueDart();
		else
			throw new IllegalArgumentException("Invalid Courier Type");
		//create Target Class Object
		Flipkart fpkt = new Flipkart();
		//assign dependent class obj to target class obj
		fpkt.setCourier(courier);
		
		return fpkt;
	}

}//class
