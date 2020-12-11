package com.cognixia.jump.model;

public class Customer {

	private int id;
	private String name;
	private String address;
	private int visitId;
	
	public Customer() {
		this.id = 0;
		this.name = null;
		this.address = null;
		this.visitId = 0;
	}
	
	public Customer(int id) {
		this.id = id;
		this.name = null;
		this.address = null;
		this.visitId = 0;
	}
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.address = null;
		this.visitId = 0;
	}
	
	public Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.visitId = 0;
	}

	public Customer(int id, String name, String address, int visitId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.visitId = visitId;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getVisitId() {
		return visitId;
	}

	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", visit_id=" + visitId + "]";
	}

}
