package com.cognixia.jump.model;

public class ShelterWithAnimals {
	
	private int shelter_id;
	private String shelter_name;
	private String shelte_address;
	private int animal_id;
	private String animal_name;
	private String animal_type;
	private String breed;
	private String gender;
	public ShelterWithAnimals(int shelter_id, String shelter_name, String shelte_address, int animal_id,
			String animal_name, String animal_type, String breed, String gender) {
		
		this.shelter_id = shelter_id;
		this.shelter_name = shelter_name;
		this.shelte_address = shelte_address;
		this.animal_id = animal_id;
		this.animal_name = animal_name;
		this.animal_type = animal_type;
		this.breed = breed;
		this.gender = gender;
	}
	public int getShelter_id() {
		return shelter_id;
	}
	public void setShelter_id(int shelter_id) {
		this.shelter_id = shelter_id;
	}
	public String getShelter_name() {
		return shelter_name;
	}
	public void setShelter_name(String shelter_name) {
		this.shelter_name = shelter_name;
	}
	public String getShelte_address() {
		return shelte_address;
	}
	public void setShelte_address(String shelte_address) {
		this.shelte_address = shelte_address;
	}
	public int getAnimal_id() {
		return animal_id;
	}
	public void setAnimal_id(int animal_id) {
		this.animal_id = animal_id;
	}
	public String getAnimal_name() {
		return animal_name;
	}
	public void setAnimal_name(String animal_name) {
		this.animal_name = animal_name;
	}
	public String getAnimal_type() {
		return animal_type;
	}
	public void setAnimal_type(String animal_type) {
		this.animal_type = animal_type;
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
	@Override
	public String toString() {
		return "ShelterWithAnimals [shelter_id=" + shelter_id + ", shelter_name=" + shelter_name + ", shelte_address="
				+ shelte_address + ", animal_id=" + animal_id + ", animal_name=" + animal_name + ", animal_type="
				+ animal_type + ", breed=" + breed + ", gender=" + gender + "]";
	}
	
	
	
	
}
