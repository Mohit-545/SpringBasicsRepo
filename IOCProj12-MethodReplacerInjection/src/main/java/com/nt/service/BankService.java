//BankService.java
package com.nt.service;

public class BankService {
	
	public double calculateInterestAmt(double pamt, double rate, double time) {
		System.out.println("BankService.calculateInterestAmt() - Compound Interest amount");
		return (pamt*Math.pow(1+rate/100, time))-pamt;
	}
	
}//class
