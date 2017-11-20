package com.pointwest.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.pointwest.training.bean.AnimalBean;
import com.pointwest.training.ui.AnimalShelterUi;

public class AnimalShelterManager {
	public static List<AnimalBean> listOfAnimals = new ArrayList<AnimalBean>();

	public List<AnimalBean> addAnimal(AnimalBean animal) {
		listOfAnimals.add(animal);
		return listOfAnimals;

	}

	public List<AnimalBean> removeAnimal(int animalId, List<AnimalBean> listOfAnimals) {

		boolean isFound = false;
		if (listOfAnimals.isEmpty()) {
			AnimalShelterUi animalShelterUi = new AnimalShelterUi();
			animalShelterUi.displayNoAnimalMessage();
		} else {
			if (!listOfAnimals.isEmpty()) {
				for (AnimalBean animal : listOfAnimals) {
					if (animal.getNewAnimalID() == (animalId)) {
						listOfAnimals.remove(animal);
						isFound = true;
						break;
					}
				}
			}

		}
		AnimalShelterUi animalShelterUi = new AnimalShelterUi();
		animalShelterUi.isFoundValue(isFound);
		return listOfAnimals;

	}

}
