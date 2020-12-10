package com.cognixia.jump.model;

public class Visit {

	private int id;
	private String date;
	private String service_Rendered;
	private int shelter_id;

	public Visit(int id, String date, String service_Rendered, int shelter_id) {
		super();
		this.id = id;
		this.date = date;
		this.service_Rendered = service_Rendered;
		this.shelter_id = shelter_id;
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

	public String getService_Rendered() {
		return service_Rendered;
	}

	public void setService_Rendered(String service_Rendered) {
		this.service_Rendered = service_Rendered;
	}

	public int getShelter_id() {
		return shelter_id;
	}

	public void setShelter_id(int shelter_id) {
		this.shelter_id = shelter_id;
	}

	@Override
	public String toString() {
		return "Visit [id=" + id + ", date=" + date + ", service_Rendered=" + service_Rendered + ", shelter_id="
				+ shelter_id + "]";
	}

}
