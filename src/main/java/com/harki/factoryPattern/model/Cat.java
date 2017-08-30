package com.harki.factoryPattern.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal{

	@Override
	void speak() {
		System.out.println("Dog Meow!!!");
		
	}
}
