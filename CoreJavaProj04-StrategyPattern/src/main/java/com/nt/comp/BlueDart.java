//BlueDart.java (Dependent class 2)
package com.nt.comp;

import org.springframework.stereotype.Component;

public class BlueDart implements Courier {

	@Override
	public String deliver(int oid) {

		return "order number "+ oid+", are kept ready for delivery by BlueDart Couriers";
	}

}//class
