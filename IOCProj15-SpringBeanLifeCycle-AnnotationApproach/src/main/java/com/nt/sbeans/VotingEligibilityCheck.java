//VotingEligibilityCheck.java
package com.nt.sbeans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vec")
public class VotingEligibilityCheck  {
	//spring bean properties
	@Value("${Voter.name}")
	private String name;
	@Value("${Voter.age}")
	private int age;
	private Date verifiedOn;
	
	public VotingEligibilityCheck() {
		System.out.println("VotingEligibilityCheck::0-param Constructor");
	}
	
	//b.method
	public String checkVotingEligibility() {
		 System.out.println("VotingEligibilityCheck.checkVotingEligibility() - (b.method)");
		 	if(age<18)
		 		return "Mr./Ms./Mrs. "+name+" you are not eligible for voting";
		 	else 
		 		return "Mr./Ms./Mrs. "+name+" you are eligible for voting";
	}//b.method
	
	//using spring supplied initialization and destruction methods by implementing interfaces
	
	@PostConstruct
	public void myInit() {
		System.out.println("VotingEligibilityCheck.myInit()");
		//initialize the left over properties
		verifiedOn = new Date();
		//check whether the imp properties are cfg with correct values or not 
		if(name==null || name.trim().length()==0 || age<0) {
			throw new IllegalArgumentException("invalid values are injected to spring bean properties (name,age)");
		}
	}//myInit()
	
	@PreDestroy
	public void myDestroy() {
	System.out.println("VotingEligibilityCheck.destroy()");
	//nullify the spring bean properties
			name = null;
			age = 0;
	}//myDestroy()
		
}//class
