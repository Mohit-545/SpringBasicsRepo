//DTDC.java (Dependent Class 1)
package com.nt.comp;

import org.springframework.stereotype.Component;

public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		
		return "order number "+ oid+", are kept ready for delivery by DTDC couriers";
	}

}//class
