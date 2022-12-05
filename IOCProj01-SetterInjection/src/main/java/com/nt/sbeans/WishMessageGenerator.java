//WishMessageGenerator.java (Target  Class)
package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	//HAS-A property
	@Autowired //Field Injection
	private LocalDateTime dateTime;
	@Autowired  //Field Injection
	private Date date;
	
//	//constructor injection
//	public WishMessageGenerator(LocalDateTime dateTime) {
//		System.out.println("WishMessageGenerator:1-param constructor");
//		this.dateTime = dateTime;
//	}
	
//	//setter method for Setter Injection
//	@Autowired
//	public void setDateTime(LocalDateTime dateTime) {
//		System.out.println("WishMessageGenerator.setDateTime()");
//		this.dateTime = dateTime;
//	}
	
	//b.method
	public String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()");
		//get hour of the day
		int hour = dateTime.getHour();
		//generate the wish message
		if(hour<12) {
			return "Good Morning "+user;
		}
		else if(hour<16) {
			return "Good Afternoon "+user;
		}
		else if(hour<20) {
			return "Good Evening "+user;
		}
		else
			return "Good Night "+user;
	}//b.method
	
}//class
