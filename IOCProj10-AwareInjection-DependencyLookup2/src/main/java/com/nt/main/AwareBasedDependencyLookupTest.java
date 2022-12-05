//AwareBasedDependencyLookupTest	.java
package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.Cricketer;

public class AwareBasedDependencyLookupTest {
	
    public static void main( String[] args ) {
    	//create IOC Container 
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	System.out.println("---------------------------------------------------------------------------");
    	//get the target spring bean class object
    	Cricketer cktr = ctx.getBean("cktr",Cricketer.class);
    	//invoke the b.method
    	System.out.println(cktr.batting());
    	System.out.println(cktr.bowling());
    	System.out.println(cktr.fielding());
    	System.out.println(cktr.wicketKeeping());
    	System.out.println("---------------------------------------------------------------------------");
    	System.out.println(cktr.batting());
    
    }//main

}//class
