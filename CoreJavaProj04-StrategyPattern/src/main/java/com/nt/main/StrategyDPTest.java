//PersonInfoTest.java
package com.nt.main;

import com.nt.comp.Flipkart;
import com.nt.factory.FlipkartFactory;


public class StrategyDPTest {
    public static void main( String[] args ) {
       Flipkart fpkt = FlipkartFactory.getInstance("dtdc");
    	//invoke the b.method
    	String msg = fpkt.shopping(new String[] {"shirt","trouser"}, new double[] {3000.0,5000.0} );
    	System.out.println(msg);
    
    }//main
}//class
