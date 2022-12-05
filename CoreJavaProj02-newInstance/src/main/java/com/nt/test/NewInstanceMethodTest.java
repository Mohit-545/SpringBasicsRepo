//NewInstanceMethodTest.java
package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethodTest {

	public static void main(String[] args) throws Exception {
		// load the class dynamically at run-time 
		Class c = Class.forName(args[0]);
		//get all declared Constructors
		Constructor[] cons = c.getDeclaredConstructors();
		//create object for the loaded class
		Object obj1 = cons[0].newInstance(); //uses 0-param cons
		System.out.println(obj1.toString());
		System.out.println("------------------------------------------------------");
		Object obj2 = cons[1].newInstance(10,20);
		System.out.println(obj2.toString()); //used 2-param cons

	}//main

}//class
