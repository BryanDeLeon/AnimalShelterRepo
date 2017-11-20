package com.pointwest.training.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pointwest.training.bean.AnimalBean;
import com.pointwest.training.manager.AnimalShelterManager;
import com.pointwest.training.ui.AnimalShelterUi;

public class AnimalShelterMain {

	public static void main(String[] args) {
		List<AnimalBean> listOfAnimals = new ArrayList<AnimalBean>();
		// TODO Auto-generated method stub

		boolean mainSwitch = true;
		int animalCounter = 0;
		AnimalShelterUi animalShelterUi = new AnimalShelterUi();
		AnimalShelterManager animalShelterManager = new AnimalShelterManager();
		
		while (mainSwitch) {

			String inputHomePage = animalShelterUi.displayHomePage();

			Scanner input = new Scanner(System.in);

			if (inputHomePage.equals("1")) {

				listOfAnimals = animalShelterUi.displayAddAnimalPage(listOfAnimals);
				animalCounter++;

			} else if (inputHomePage.equals("2")) {
				listOfAnimals = animalShelterUi.removeAnimalPage(listOfAnimals);
				animalCounter--;

			} else if (inputHomePage.equals("3")) {
				animalShelterUi.viewAnimalPage(listOfAnimals);
			}

			if (animalCounter == 10) {
				mainSwitch = false;
			}
		}
		animalShelterUi.displayEndMessage();
	}

}
