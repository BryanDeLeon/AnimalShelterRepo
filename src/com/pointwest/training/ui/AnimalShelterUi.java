package com.pointwest.training.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pointwest.training.bean.AnimalBean;
import com.pointwest.training.bean.CatBean;
import com.pointwest.training.bean.DogBean;
import com.pointwest.training.bean.ParrotBean;
import com.pointwest.training.main.AnimalShelterMain;
import com.pointwest.training.manager.AnimalShelterManager;

public class AnimalShelterUi {
	AnimalShelterMain animalShelterMain = new AnimalShelterMain();
	public static int animalID = 0;

	// display HomePage
	public String displayHomePage() {
		String input;

		Scanner scanner = new Scanner(System.in);
		System.out.println("\nWelcome to Tabz' Animal Shelter!");
		System.out.println("Please select an option: ");
		System.out.println("[1] Add an Animal");
		System.out.println("[2] Remove an Animal");
		System.out.println("[3] View all Animals");
		System.out.println("Enter choice: ");

		input = scanner.nextLine();

		return input;
	}

	// displays what animal you want to add (Add animal Page)
	public List<AnimalBean> displayAddAnimalPage(List<AnimalBean> listOfAnimals) {
		String input;

		Scanner scanner = new Scanner(System.in);
		System.out.println("\nAdd an Animal");
		System.out.println("What Animal are you trying ot add?");
		System.out.println("[1] A Dog");
		System.out.println("[2] A Cat");
		System.out.println("[3] A Parrot");
		System.out.println("Enter choice: ");

		input = scanner.nextLine();

		// add dog to the list
		if (input.equals("1")) {
			System.out.println("Enter Name: ");
			String inputName = scanner.nextLine();
			System.out.println("Enter Age: ");
			int inputAge = scanner.nextInt();
			System.out.println("Enter Gender: ");
			String inputGender = scanner.next();

			DogBean dog = new DogBean();
			dog.setName(inputName);
			dog.setAge(inputAge);
			dog.setGender(inputGender);
			dog.setNewAnimalID(dog.getAnimalID() + animalID);

			// dog to animal
			AnimalShelterManager animalShelterManager = new AnimalShelterManager();
			listOfAnimals = animalShelterManager.addAnimal(dog);

			// add cat to the list
		} else if (input.equals("2")) {
			System.out.println("Enter Name: ");
			String inputName = scanner.nextLine();
			System.out.println("Enter Age: ");
			int inputAge = scanner.nextInt();
			System.out.println("Enter Gender: ");
			String inputGender = scanner.next();

			CatBean cat = new CatBean();
			cat.setName(inputName);
			cat.setAge(inputAge);
			cat.setGender(inputGender);
			cat.setNewAnimalID(cat.getAnimalID() + animalID);

			// cat to animal
			AnimalShelterManager animalShelterManager = new AnimalShelterManager();
			listOfAnimals = animalShelterManager.addAnimal(cat);

		} else if (input.equals("3")) {
			System.out.println("Enter Name: ");
			String inputName = scanner.nextLine();
			System.out.println("Enter Age: ");
			int inputAge = scanner.nextInt();
			System.out.println("Enter Gender: ");
			String inputGender = scanner.next();

			ParrotBean parrot = new ParrotBean();
			parrot.setName(inputName);
			parrot.setAge(inputAge);
			parrot.setGender(inputGender);
			parrot.setNewAnimalID(parrot.getAnimalID() + animalID);

			AnimalShelterManager animalShelterManager = new AnimalShelterManager();
			listOfAnimals = animalShelterManager.addAnimal(parrot);

		}
		System.out.println("Animal is now added.");
		animalID++;
		return listOfAnimals;
	}

	public List<AnimalBean> removeAnimalPage(List<AnimalBean> listOfAnimals) {

		System.out.println("Please enter the reference ID of the animal to remove:");

		Scanner scanner = new Scanner(System.in);

		int removeInput = scanner.nextInt();

		AnimalShelterManager animalShelterManager = new AnimalShelterManager();
		listOfAnimals = animalShelterManager.removeAnimal(removeInput, listOfAnimals);

		return listOfAnimals;

	}

	public void isFoundValue(boolean isFound) {

		if (isFound == true) {
			System.out.println("The animal is now removed.");
		} else {
			System.out.println("Animal ID not found.");
		}
	}

	public void viewAnimalPage(List<AnimalBean> listOfAnimals) {

		if (listOfAnimals.isEmpty()) {
			System.out.println("The Shelter is currently empty");
		} else {
			for (AnimalBean animal : listOfAnimals) {
				animal.doSound();
			}
		}

	}

	public void displayEndMessage() {
		System.out.println("Program now ends. Bye!");
	}

	public void displayNoAnimalMessage() {
		System.out.println("The shelter has no animals.");
	}
}
