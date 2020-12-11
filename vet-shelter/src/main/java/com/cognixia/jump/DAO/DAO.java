package com.cognixia.jump.DAO;

import java.util.List;

public interface DAO<T> {

		// methods for interacting with DB
	
	
	
	// list All entries
	//public List<Department> getAllDepartments();
	public List<T> getAll();
	
	// list one entry by ID
	// public Department getById(int deptId);
	public T getById(int id);
	
	// list one entry by NAME
	// public Department getByName(String name);
	public T getByAttribute(String attribute, String value);
	
	// add a department
	// public boolean addDepartment(Department dept);
	public boolean add(T entry);
	
	// delete a department
	// public boolean deleteDepartment(int deptId);
	public boolean deleteById(int id);
	
	// update a department
	// public int updateDepartment(Department dept);
	public int update(T entry);
	
}
