//SetterInjectionTest.java (Client App)
package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("SetterInjectionTest.main().start");
		// create the IOC Container
		FileSystemXmlApplicationContext ctx = 
				new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
		//get the target spring bean class obj ref
		Object obj = ctx.getBean("wmg");
		//type casting
		WishMessageGenerator wmg = (WishMessageGenerator)obj;
		//invoke the b.method
		String result = wmg.showWishMessage("raja");
		//display the result
		System.out.println(result);
		//close the container
		ctx.close();
		System.out.println("SetterInjectionTest.main().end");

	}//main

}//class
