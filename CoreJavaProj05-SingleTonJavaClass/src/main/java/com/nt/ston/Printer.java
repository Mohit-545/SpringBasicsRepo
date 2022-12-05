//Printer.java
package com.nt.ston;

public class Printer {
	//reference variable of the calss
	private static Printer Instance;
	
	//private constructor
	private Printer() {
		System.out.println("Printer.printer():0-param constructor");
	}
	//static factory method having SingleTon logic
	public static Printer getInstance() {
		System.out.println("Printer.getInstance()");
		//singleton logic with minimum logics
		if(Instance == null) {
			Instance = new Printer();
		}
		return Instance;
	}
}//class
