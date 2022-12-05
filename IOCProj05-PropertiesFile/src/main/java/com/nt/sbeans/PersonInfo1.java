//PersonInfo1.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("pInfo1")
@PropertySource("com/nt/commons/Info.properties")
public class PersonInfo1 {
	@Autowired
	private Environment evr;
	
	
	@Override
	public String toString() {
		
		return "[ name : "+evr.getProperty("per.name")+"   \nage : "+evr.getProperty("per.age")+"  \naddress : "+evr.getProperty("per.addrs")+"   \nosname : "
			 +evr.getProperty("os.name")+"   \nusername : "+evr.getProperty("user.name")+"   \npath : "+evr.getProperty("Path")+" ]";
	}
}//class
