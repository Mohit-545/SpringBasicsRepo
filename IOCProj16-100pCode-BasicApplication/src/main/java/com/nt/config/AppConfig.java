//AutoConfig.java
package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig::0-param constructor");
	}
	@Bean(name="ldt")
	public LocalDateTime createLDT() {
		return LocalDateTime.now();
	}
}//class
