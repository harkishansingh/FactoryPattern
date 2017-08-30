package com.harki.factoryPattern.model;

import org.springframework.stereotype.Component;

@Component
public class Lion extends Animal{

	@Override
	void speak() {
		System.out.println("Lion Roars!!!");
		
	}
}
