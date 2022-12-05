//Cricketer.java
package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
@Lazy(true)
public class Cricketer {
	public Cricketer() {
		System.out.println("Cricketer::0-param Constructor()");
	}
	
	public String batting() {
		//create additional IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get dependent spring bean class object (Dependency Lookup)
		CricketBat bat = ctx.getBean("cBat",CricketBat.class);
		int runs = bat.scoreRuns();
		return "Cricketer is batting with "+runs+" runs";
	}
	public String bowling() {
		return "Cricketer is bowling";
	}
	public String fielding() {
		return "Cricketer is fielding";
	}
	public String wicketKeeping() {
		return "Cricketer is wicketKeeping";
	}
}//class

