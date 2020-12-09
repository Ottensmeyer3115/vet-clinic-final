package com.cognixia.jump.model;

public class Visit {

	private int id;
	private String date;
	private String serviceRendered;

	public Visit(int id, String date, String serviceRendered) {
		super();
		this.id = id;
		this.date = date;
		this.serviceRendered = serviceRendered;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getServiceRendered() {
		return serviceRendered;
	}

	public void setServiceRendered(String serviceRendered) {
		this.serviceRendered = serviceRendered;
	}

	@Override
	public String toString() {
		return "Visit [id=" + id + ", date=" + date + ", serviceRendered=" + serviceRendered + "]";
	}

}
