//MethodInjectionTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class MethodInjectionTest {
    public static void main( String[] args ) {
        
    	//create IOC Container
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	//get the target spring bean class obj ref
    	BankService service = ctx.getBean("bankService", BankService.class);
    	System.out.println(service.getClass()+"     "+service.getClass().getSuperclass());
    	
    	//invoke the b.method
    	double intAmt = service.calculateInterestAmt(100000, 12, 2);
    	System.out.println("Interest Amount is : "+intAmt);
    	
    	//close the container
    	ctx.close();
    }//main
}//class
