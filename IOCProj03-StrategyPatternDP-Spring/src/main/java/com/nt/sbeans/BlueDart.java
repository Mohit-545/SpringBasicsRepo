//BlueDart.java (Dependent class 2)
package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bdart")
public class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {

		return "order number "+ oid+", are kept ready for delivery by BlueDart Couriers";
	}

}//class
