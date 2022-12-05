//PersonInfoTest.java
package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Flipkart;


public class StrategyDPTest {
    public static void main( String[] args ) {
        //create IOC Container
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    	//get the target spring bean class
    	Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
    	//invoke the b.method
    	String msg = fpkt.shopping(new String[] {"shirt","trouser"}, new double[] {3000.0,5000.0} );
    	System.out.println(msg);
    	ctx.close();
    }//main
}//class
