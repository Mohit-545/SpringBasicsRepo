//Test.java
package com.nt.comp;

public class Test {
	private int a;
	private int b;
	
	//0-param constructor
	public Test() {
		System.out.println("Test.Test():0-param constructor");
	}
	//param constructor
	public Test(int x, int y) {
		System.out.println("Test.Test():2-param constructor");
		this.a = x;
		this.b = y;
	}
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
	
}//class
