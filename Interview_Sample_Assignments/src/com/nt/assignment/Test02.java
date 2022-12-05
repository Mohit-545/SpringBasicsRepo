package com.nt.assignment;

import java.util.Scanner;
													//Problem 2
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Search String : ");
		String input = sc.next();
		String[] sarr = {"Cecilio Johnes","Cordell Acott","Curtice Bleue","Dalis Menary","Emanuele Barstock",
				"Emmy Bradane","Gian Cossington","Jamaal Danilevich","Kerri Wilce","Liuka Cowern",
				"Merrel Cornuau","Marena Appleton","Marlee Stobo","Rochette Brew","Rudyard Abbate",
				"Sharona Climo","Shirlee Titcumb","Taite Joriot","Taite Huntriss","Zach Simchenko"};
		for(int i=0; i<sarr.length; i++) {
			String[] st = sarr[i].split(" ");
				
					if(st[0].startsWith(input) || st[1].startsWith(input)) {
						System.out.println(sarr[i]);
					
					}
					else {
						continue;
					}
					
				
		}
	}//main
}
