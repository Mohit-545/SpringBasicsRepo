package com.nt.assignment;

import java.util.Scanner;
													//Problem 1
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//main String 
		System.out.print("Enter the First/Main String : ");
		String mainStr = sc.nextLine();
		//String to be removed 
		System.out.print("Enter the Second/Remove String : ");
		String remStr = sc.nextLine();
		//temp String for storing updated main String
		String tempStr = "";
		String[] strarr = mainStr.split(" ");
		//for loop for iterating the String array and to remove given String from main String
		for(int i=0; i<strarr.length; i++) {
			//if-condition for checking String that is to be removed from the main String
			if(!strarr[i].equalsIgnoreCase(remStr)) {
				tempStr +=strarr[i]+" ";
			}//if
		}//for
		System.out.println("Updated main String");
		System.out.println("=============================================================================");
		System.out.println(tempStr.trim());
		
	}//main

}
