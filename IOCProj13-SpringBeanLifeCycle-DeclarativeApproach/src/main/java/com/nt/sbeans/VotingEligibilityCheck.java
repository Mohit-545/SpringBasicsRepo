//VotingEligibilityCheck.java
package com.nt.sbeans;

import java.util.Date;

public class VotingEligibilityCheck {
	//spring bean properties
	private String name;
	private int age;
	private Date verifiedOn;
	
	public VotingEligibilityCheck() {
		System.out.println("VotingEligibilityCheck::0-param Constructor");
	}
	
	public void setName(String name) {
		System.out.println("VotingEligibilityCheck.setName()");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.println("VotingEligibilityCheck.setAge()");
		this.age = age;
	}
	
	//b.method
	public String checkVotingEligibility() {
		 	System.out.println("VotingEligibilityCheck.checkVotingEligibility()");
		 	if(age<18)
		 		return "Mr./Ms./Mrs. "+name+" you are not eligible for voting";
		 	else 
		 		return "Mr./Ms./Mrs. "+name+" you are eligible for voting";
	}//b.method
	
	//creating custom initialization and destruction methods
	
	public void myInit() {
		System.out.println("VotingEligibilityCheck.myInit()");
		//initialize the left over properties
		verifiedOn = new Date();
		//check whether the imp properties are cfg with correct values or not 
		if(name==null || name.trim().length()==0 || age<0) {
			throw new IllegalArgumentException("invalid values are injected to spring bean properties (name,age)");
		}
	}//myInit()
	
	public void myDestroy() {
		System.out.println("VotingEligibilityCheck.myDestroy()");
		//nullify the spring bean properties
		name = null;
		age = 0;
	}//myDestroy()
		
}//class
