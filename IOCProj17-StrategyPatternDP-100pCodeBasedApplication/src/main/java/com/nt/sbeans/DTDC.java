//DTDC.java (Dependent Class 1)
package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		
		return "order number "+ oid+", are kept ready for delivery by DTDC couriers";
	}

}//class
