//SpringBeanLifeCycleTest.java
package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.VotingEligibilityCheck;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		// create IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get the target spring bean class obj ref
		VotingEligibilityCheck vec = ctx.getBean("vec", VotingEligibilityCheck.class);
		System.out.println("----------------------------------------------------------------------------------------------------");
	try {
		//invoke the b.method
		String result = vec.checkVotingEligibility();
		System.out.println(result);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	System.out.println("----------------------------------------------------------------------------------------------------");
		//close the container
		ctx.close();

	}//main

}//class
