package com.cognixia.jump.model;

public class Customer {

	private int id;
	private String name;
	private String address;
	private int visit_id;

	public Customer(int id, String name, String address, int visit_id) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.visit_id = visit_id;
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

	public int getVisit_id() {
		return visit_id;
	}

	public void setVisit_id(int visit_id) {
		this.visit_id = visit_id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", visit_id=" + visit_id + "]";
	}

}
