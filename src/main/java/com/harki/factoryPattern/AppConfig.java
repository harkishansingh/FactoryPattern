package com.harki.factoryPattern;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.harki.factoryPattern")
public class AppConfig{
	
	public static void main(String[] args){
		System.out.println("Hello World!!");
	}
	
}
