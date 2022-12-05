//Cricketer.java
package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
public abstract class Cricketer {
	
public Cricketer() {
		System.out.println("Cricketer::0-param Constructor()");
	}
	
	@Lookup("cBat")
	public abstract CricketBat getBat();
	
	public String batting() {
		//get dependent spring bean class object (Dependency Lookup)
		CricketBat bat = getBat();
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

