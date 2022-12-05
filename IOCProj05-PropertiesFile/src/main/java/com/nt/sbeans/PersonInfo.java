//PersonInfo.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("pInfo")
@PropertySource("com/nt/commons/Info.properties")
public class PersonInfo {
	@Value("${per.name}")
	private String name;
	@Value("${per.age}")
	private int age;
	@Value("${per.addrs}")
	private String addrs;
	@Value("${os.name}")
	private String osName;
	@Value("${user.name}")
	private String uName;
	@Value("${Path}")
	private String pathData;
	
	
	@Override
	public String toString() {
		return "PersonInfo [name=" + name + ", age=" + age + ", addrs=" + addrs + ", osName=" + osName + ", uName="
				+ uName + ", \npathData=" + pathData + "]";
	}
	
	
}//class
