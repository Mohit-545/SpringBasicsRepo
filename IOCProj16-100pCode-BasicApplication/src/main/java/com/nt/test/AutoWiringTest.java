//AutoWiringTest.java
package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class AutoWiringTest {

	public static void main(String[] args) {
		//create the IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		//get the Spring bean class obj ref
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke the b.method
		String resMeg = generator.generateWishMessage("mohit");
		System.out.println(resMeg);
		//close the container
		ctx.close();
	}//main

}//class
