package com.cognixia.jump.model;

public class Animal {

	private int id;
	private String name;
	private String type;
	private String breed;
	private String gender;
	private int shelter_id;
	private int customer_id;

	public Animal(int id, String name, String type, String breed, String gender, int shelter_id, int customer_id) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.breed = breed;
		this.gender = gender;
		this.shelter_id = shelter_id;
		this.customer_id = customer_id;
	}

	public int getShelter_id() {
		return shelter_id;
	}

	public void setShelter_id(int shelter_id) {
		this.shelter_id = shelter_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		return "Animal [id=" + id + ", name=" + name + ", type=" + type + ", breed=" + breed + ", gender=" + gender
				+ "]";
	}

}
