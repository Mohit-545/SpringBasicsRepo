//PersonInfoTest.java
package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;


public class StrategyDPTest {
    public static void main( String[] args ) {
        //create IOC Container
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	//get the target spring bean class
    	Flipkart fpkt = ctx.getBean("fpkt", Flipkart.class);
    	//invoke the b.method
    	String msg = fpkt.shopping(new String[] {"shirt","trouser"}, new double[] {3000.0,5000.0} );
    	System.out.println(msg);
    	ctx.close();
    }//main
}//class
