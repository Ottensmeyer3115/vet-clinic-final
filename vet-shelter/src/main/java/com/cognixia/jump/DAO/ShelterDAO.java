package com.cognixia.jump.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.connection.ConnectionManager;
import com.cognixia.jump.model.Animal;

public class ShelterDAO {

	public static final Connection conn = ConnectionManager.getConnection();

	private static final String SELECT_ALL_ANIMALS = "SELECT \n" + "shelter.shelter_id, " + "animals.animal_id,"
			+ " shelter.shelter_name,\n" + " shelter.shelter_address,\n" + " animals.animal_name, \n"
			+ " animals.animal_type,\n" + " animals.breed, \n" + " animals.gender\n" + " FROM \n"
			+ " finalprojectgrp2.shelter\n" + " LEFT JOIN finalprojectgrp2.animals ON\n"
			+ " shelter.shelter_id = animals.shelter_id";
	private static final String SELECT_ANIMAL_BY_ID = "select * from finalprojectgrp2.animals WHERE animal_id = ? ";
	private static final String INSERT_ANIMAL = "insert into finalprojectgrp2.animals (animal_name, animal_type, breed, gender, shelter_id, customer_id) values(?, ?, ?, ?, ?, ?)";
	private static final String DELETE_ANIMAL = "delete from finalprojectgrp2.animals where animal_id = ?";
	private static final String UPDATE_ANIMAL = "update finalprojectgrp2.animals set animal_name = ?, animal_type = ?, animal_breed = ?, animal_gender = ? where animal_id = ?";

	/**
	 * private static final String SELECT_ANIMAL_BY_CUSTOMER_ID = "select * from
	 * animals " + "JOIN customer ON " + + "customer.customer_id__=
	 * animals.customer_id";
	 * 
	 **/
	public List<Animal> getAllAnimals() {
		List<Animal> allAnimals = new ArrayList<>();
		try (PreparedStatement pstmt = conn.prepareStatement(SELECT_ALL_ANIMALS); ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {

				int shelter_id = rs.getInt("shelter_id");
				String shelter = rs.getString("shelter_name");
				String shelter_address = rs.getString("shelter_address");
				int id = rs.getInt("animal_id");
				String name = rs.getString("animal_name");
				String type = rs.getString("animal_type");
				String breed = rs.getString("breed");
				String gender = rs.getString("gender");
				allAnimals.add(new Animal(id, name, type, breed, gender, shelter_id, 0));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allAnimals;
	}

	public Animal getAnimalById(int id) {
		Animal animal = null;
		try (PreparedStatement pstmt = conn.prepareStatement(SELECT_ANIMAL_BY_ID)) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			// if Animal found, if statement run, if not null returned as Animal
			if (rs.next()) {
				int shelterId = rs.getInt("shelter_id");
				String name = rs.getString("animal_name");
				String type = rs.getString("animal_type");
				String breed = rs.getString("breed");
				String gender = rs.getString("gender");
				animal = new Animal(id, name, type, breed, gender, shelterId, 0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return animal;
	}

	public boolean addAnimal(Animal animal) {
		try (PreparedStatement pstmt = conn.prepareStatement(INSERT_ANIMAL)) {
			pstmt.setString(1, animal.getAnimalName());
			pstmt.setString(2, animal.getType());
			pstmt.setString(3, animal.getBreed());
			pstmt.setString(4, animal.getGender());
			pstmt.setInt(5, animal.getShelterId());
			pstmt.setInt(6, animal.getCustomerId());
			// at least one row added
			if (pstmt.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean deleteAnimal(int id) {
		try (PreparedStatement pstmt = conn.prepareStatement(DELETE_ANIMAL)) {
			pstmt.setInt(1, id);
			// at least one row deleted
			if (pstmt.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean updateAnimal(Animal animal) {
		try (PreparedStatement pstmt = conn.prepareStatement(UPDATE_ANIMAL)) {

			pstmt.setString(1, animal.getAnimalName());
			pstmt.setString(2, animal.getType());
			pstmt.setString(3, animal.getBreed());
			pstmt.setString(4, animal.getGender());
			pstmt.setInt(5, animal.getShelterId());
			// at least one row updated
			if (pstmt.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}