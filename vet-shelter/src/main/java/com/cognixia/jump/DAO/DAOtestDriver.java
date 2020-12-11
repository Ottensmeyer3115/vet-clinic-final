package com.cognixia.jump.DAO;

import java.util.List;

import com.cognixia.jump.model.Animal;

public class DAOtestDriver {
	
	static ShelterDAO shelterDao = new ShelterDAO();
	static CustomerDAO customerDao = new CustomerDAO();
	

	public static void main(String[] args) {
		testGetAllAnimals();
		System.out.println();
		testGetAnimalsById();
		System.out.println();
		testAddAnimal();
		System.out.println();
	}
	
	public static void testGetAllAnimals() {
		List<Animal> animals = shelterDao.getAllAnimals();
		System.out.println(animals);
	}
	
	public static void testGetAnimalsById() {
		Animal testAnimal = shelterDao.getAnimalById(2);
		System.out.println(testAnimal);
	}
	
	public static void testAddAnimal() {
		//Animal animal1 = new Animal();
		//Animal animal2 = new Animal(1);
		//Animal animal3 = new Animal(2, "Scrappy");
		//Animal animal4 = new Animal(3, "Duffy", "dog");
		//Animal animal5 = new Animal(4, "Abby", "dog", "copper spaniel");
		//Animal animal6 = new Animal(5, "Billy", "cat", "turquise", "male");
		Animal animal7 = new Animal(6, "Bob", "dog", "german shepard", "male", 11);
	
		//boolean test1 = shelterDao.addAnimal(animal1);
		//boolean test2 = shelterDao.addAnimal(animal2);
		//boolean test3 = shelterDao.addAnimal(animal3);
		//boolean test4 = shelterDao.addAnimal(animal4);
		//boolean test5 = shelterDao.addAnimal(animal5);
		//boolean test6 = shelterDao.addAnimal(animal6);
		boolean test7 = shelterDao.addAnimal(animal7);
		
		//System.out.println(test1);
		//System.out.println(test2);
		//System.out.println(test3);
		//System.out.println(test4);
		//System.out.println(test5);
		//System.out.println(test6);
		System.out.println(test7);
		
	}
	
}
