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
	
	private static final String SELECT_ALL_ANIMALS = "select * from animals";
	private static final String SELECT_ANIMAL_BY_ID = "select * from animals WHERE animal_id = ? ";
	private static final String INSERT_ANIMAL = "insert into animal (animal_name, animal_type, breed, gender) values(?, ?, ?, ?)";
	private static final String DELETE_ANIMAL = "delete from product where animal_id = ?";
	private static final String UPDATE_ANIMAL = "update animal set animal_name = ?, animal_type = ?, animal_breed = ?, animal_gender = ? where animal_id = ?";
	

	/**
	private static final String SELECT_ANIMAL_BY_CUSTOMER_ID = "select * from animals "
			+ "JOIN customer ON " +
			+ "customer.customer_id__= animals.customer_id";
	
	**/
	public List<Animal> getAllAnimals() {

		List<Animal> allAnimals = new ArrayList<Animal>();

		try (PreparedStatement pstmt = conn.prepareStatement(SELECT_ALL_ANIMALS);

				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {

				int id = rs.getInt("animal_id");
				String name = rs.getString("animal_name");
				String type = rs.getString("animal_type");
				String breed = rs.getString("breed");
				String gender = rs.getString("gender");

				allAnimals.add(new Animal(id, name, type, breed, gender));

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
				String name = rs.getString("animal_name");
				String type = rs.getString("animal_type");
				String breed = rs.getString("breed");
				String gender = rs.getString("gender");

				animal = new Animal(id, name, type, breed, gender);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return animal;
	}

	public boolean addAnimal(Animal animal) {

		try (PreparedStatement pstmt = conn.prepareStatement(INSERT_ANIMAL)) {

			pstmt.setString(1, animal.getName());
			pstmt.setString(2, animal.getType());
			pstmt.setString(3, animal.getBreed());
			pstmt.setString(4, animal.getGender());

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

			
			pstmt.setInt(1, animal.getId());
			pstmt.setString(2, animal.getName());
			pstmt.setString(3, animal.getType());
			pstmt.setString(4, animal.getBreed());
			pstmt.setString(5, animal.getGender());

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
