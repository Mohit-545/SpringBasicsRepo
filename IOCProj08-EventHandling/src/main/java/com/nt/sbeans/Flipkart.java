//Flipkart.java (Target class)
package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
//HAS-A property
	@Autowired
	//@Qualifier("bdart")
	@Qualifier("shipper")
	private Courier courier;
	
	//b. method 
	public String shopping(String[] items, double[] prices) {
		// calculate the bill amount
		double billAmt = 0.0;
		for(double p : prices) {
			billAmt = billAmt + p;
		}
		//generate the order id on random basis
		int oid = new Random().nextInt(1000);
		//deliver the product
		String msg = courier.deliver(oid);
		
		return "items : "+ Arrays.toString(items)+" with bill amount - "+billAmt+",   "+msg;
	}
}//class
