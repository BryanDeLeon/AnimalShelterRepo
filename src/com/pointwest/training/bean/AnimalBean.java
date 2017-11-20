package com.pointwest.training.bean;

public abstract class AnimalBean {
	
	protected String name;
	protected int age;
	protected String gender;
	public static int animalID = 0;
	protected int newAnimalID;
	
	public void doSound () {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getNewAnimalID() {
		return newAnimalID;
	}
	public void setNewAnimalID(int newAnimalID) {
		this.newAnimalID = newAnimalID;
	}
	public static int getAnimalID() {
		return animalID;
	}
	public static void setAnimalID(int animalID) {
		AnimalBean.animalID = animalID;
	}
	

}
