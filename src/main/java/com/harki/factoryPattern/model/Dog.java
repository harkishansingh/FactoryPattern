package com.harki.factoryPattern.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{

	@Override
	void speak() {
		System.out.println("Dog Bark!!!");
		
	}

}
