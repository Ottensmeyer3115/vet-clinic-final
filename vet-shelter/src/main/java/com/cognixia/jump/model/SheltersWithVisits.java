package com.cognixia.jump.model;

public class ShelterAndVisit {
	
	private int shelter_id;
	private String name;
	private String address;
	private int visit_id;
	private String date;
	private String service_Rendered;
	
	public ShelterAndVisit(int shelter_id, String name, String address, int visit_id, String date,
			String service_Rendered) {
		
		this.shelter_id = shelter_id;
		this.name = name;
		this.address = address;
		this.visit_id = visit_id;
		this.date = date;
		this.service_Rendered = service_Rendered;
		
	}
	public int getShelter_id() {
		return shelter_id;
	}
	public void setShelter_id(int shelter_id) {
		this.shelter_id = shelter_id;
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
	@Override
	public String toString() {
		return "ShelterAndVisit [shelter_id=" + shelter_id + ", name=" + name + ", address=" + address + ", visit_id="
				+ visit_id + ", date=" + date + ", service_Rendered=" + service_Rendered + "]";
	}
	
	
	
	

}
