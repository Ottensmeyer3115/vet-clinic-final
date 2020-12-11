package com.cognixia.jump.model;

public class Animal {

	private int id;
	private String animalName;
	private String animalType;
	private String breed;
	private String gender;
	private int shelterId;
	private int customerId;
	
	public Animal() {
		this.id = -1;
		this.animalName = null;
		this.animalType = null;
		this.breed = null;
		this.gender = null;
		this.shelterId = 0;
		this.customerId = 0;
	}
	
	public Animal (int id) {
		this.id = id;
		this.animalName = null;
		this.animalType = null;
		this.breed = null;
		this.gender = null;
		this.shelterId = 0;
		this.customerId = 0;
	}
	
	public Animal(int id, String animalName) {
		this.id = id;
		this.animalName = animalName;
		this.animalType = null;
		this.breed = null;
		this.gender = null;
		this.shelterId = 0;
		this.customerId = 0;
	}
	
	public Animal(int id, String animalName, String animalType) {
		this.id = id;
		this.animalName = animalName;
		this.animalType = animalType;
		this.breed = null;
		this.gender = null;
		this.shelterId = 0;
		this.customerId = 0;
	}
	
	public Animal(int id, String animalName, String animalType, String breed) {
		this.id = id;
		this.animalName = animalName;
		this.animalType = animalType;
		this.breed = breed;
		this.gender = null;
		this.shelterId = 0;
		this.customerId = 0;
	}
	
	public Animal(int id, String animalName, String animalType, String breed, String gender) {
		this.id = id;
		this.animalName = animalName;
		this.animalType = animalType;
		this.breed = breed;
		this.gender = gender;
		this.shelterId = 0;
		this.customerId = 0;
	}
	
	public Animal(int id, String animalName, String animalType, String breed, String gender, int shelterId) {
		this.id = id;
		this.animalName = animalName;
		this.animalType = animalType;
		this.breed = breed;
		this.gender = gender;
		this.shelterId = shelterId;
		this.customerId = 0;
	}

	public Animal(int id, String animalName, String animalType, String breed, String gender, int shelterId, int customerId) {
		super();
		this.id = id;
		this.animalName = animalName;
		this.animalType = animalType;
		this.breed = breed;
		this.gender = gender;
		this.shelterId = shelterId;
		this.customerId = customerId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getShelterId() {
		return shelterId;
	}

	public void setShelterId(int shelterId) {
		this.shelterId = shelterId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + animalName + ", type=" + animalType + ", breed=" + breed + ", gender=" + gender
				+ "]";
	}

}
