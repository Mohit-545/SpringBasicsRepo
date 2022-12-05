package com.nt.assignment;

import java.util.Scanner;
								// Problem 3
public class Test03 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number : ");
			int num = Integer.parseInt(sc.next());	
			
			int start = 0, precision = 3;
			int mid, end = num;
			double res = 0.0;
		
			//while loop for checking direct square num and converting start value less than end value for non-direct square number 
			while(start<=end) {
				mid = (start+end)/2;
			//if cond for checking direct square of the given number
				if(mid*mid == num) {
					res = mid;
					break;
				}
			//if-else cond for setting the result value by converting the start and end value to break the while loop
				if(mid*mid < num) {
					start = mid + 1;
					res = mid;
				}
				else {
					end = mid - 1;
				}
			}//while
			
			double increment = 0.1;
			//for loop for finally getting the final result value depending on the precision required
			for(int i=0; i<precision; i++) {
				while(res*res<=num) {
					res +=increment;
				}//while
			
				res = res - increment;
				increment = increment/10;
			}//for
			
		// printing the final result as float value with upto 3 precision decimal
			System.out.println((float)res);
			
	}//main
}//class
