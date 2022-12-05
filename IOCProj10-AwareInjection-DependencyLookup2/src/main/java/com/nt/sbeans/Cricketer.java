//Cricketer.java
package com.nt.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("cktr")
public class Cricketer implements ApplicationContextAware {
	private ApplicationContext ctx;

	public Cricketer() {
		System.out.println("Cricketer::0-param Constructor()");
	}
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Cricketer.setApplicationContext()");
		this.ctx = ctx;
		
	}
	
	public String batting() {
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

