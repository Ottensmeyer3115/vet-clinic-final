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

	try(
	Connection conn = ConnectionManager.getConnection())
	{
	PreparedStatement pstmt = null;
		if(shelter == visit) {
			if(customer == visit)
		}
}catch
	{

	}

	private static final String SELECT_ALL_ANIMALS = "select * from Animal";
	private static final String SELECT_ANIMAL_BY_ID = "select * from Animal where id = ?";
	private static final String INSERT_ANIMAL = "insert into Animal(name, type, breed) values(?, ?, ?)";
	private static final String DELETE_ANIMAL = "delete from Animal where id = ?";
	private static final String UPDATE_ANIMAL = "update Animal set name = ?,  type= ?, breed= ? where id = ?";

	public List<Animal> getAllAnimals() {

		List<Animal> allAnimals = new ArrayList<Animal>();

		try (PreparedStatement pstmt = conn.prepareStatement(SELECT_ALL_ANIMALS);

				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");
				String type = rs.getString("type");
				String breed = rs.getString("breed");

				allAnimals.add(new Animal(id, name, type, breed));

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
				String name = rs.getString("name");
				String type = rs.getString("type");
				String breed = rs.getString("breed");

				animal = new Animal(id, name, type, breed);
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

			pstmt.setString(1, animal.getName());
			pstmt.setString(2, animal.getType());
			pstmt.setString(3, animal.getBreed());
			pstmt.setInt(4, animal.getId());

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
