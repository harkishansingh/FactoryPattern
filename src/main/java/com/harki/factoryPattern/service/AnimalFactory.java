package com.harki.factoryPattern.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harki.factoryPattern.model.Animal;
import com.harki.factoryPattern.model.AnimalType;
import com.harki.factoryPattern.model.Cat;
import com.harki.factoryPattern.model.Dog;
import com.harki.factoryPattern.model.Lion;

@Service
public class AnimalFactory {

	@Autowired
	private Dog dog;
	@Autowired
	private Cat cat;
	@Autowired
	private Lion lion;

	public Animal getAnimal(AnimalType type) {
		if (type.equals(AnimalType.DOG)) {
			return dog;
		} else if (type.equals(AnimalType.CAT)) {
			return cat;
		} else if (type.equals(AnimalType.LION)) {
			return lion;
		}

		throw new IllegalArgumentException(type.name());
	}
}
