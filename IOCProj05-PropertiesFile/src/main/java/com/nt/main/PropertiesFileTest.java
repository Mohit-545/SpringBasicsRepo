//PersonInfoTest.java
package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.sbeans.PersonInfo;
import com.nt.sbeans.PersonInfo1;

public class PropertiesFileTest {
    public static void main( String[] args ) {
        //create IOC Container
    	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
    	//get the Target class object
//    	PersonInfo info = ctx.getBean("pInfo",PersonInfo.class);
//    	System.out.println(info);
    	PersonInfo1 info1 = ctx.getBean("pInfo1",PersonInfo1.class);
    	System.out.println(info1);
    	System.out.println();
    	System.out.println("=================================================================================================");
    	
    	Environment evr = ctx.getEnvironment();
    	System.out.println("name : "+evr.getProperty("per.name")+"   \nage : "+evr.getProperty("per.age")+"  \naddress : "+evr.getProperty("per.addrs")+"   \nosname : "
			 +evr.getProperty("os.name")+"   \nusername : "+evr.getProperty("user.name")+"   \npath : "+evr.getProperty("Path"));
    	
    	//close the container
    	ctx.close();
    }//main
}//class
