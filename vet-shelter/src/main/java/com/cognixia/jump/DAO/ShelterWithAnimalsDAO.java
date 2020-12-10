package com.cognixia.jump.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.connection.ConnectionManager;
import com.cognixia.jump.model.Animal;
import com.cognixia.jump.model.SheltersWithVisits;
import com.cognixia.jump.model.ShelterWithAnimals;

public class ShelterWithAnimalsDAO {
	
	public static final Connection conn = ConnectionManager.getConnection();

	private static final String SELECT_ALL_ANIMALS = "SELECT \n" + " shelter.shelter_name,\n"
			+ " shelter.shelter_address,\n" + " animals.animal_name, \n" + " animals.animal_type,\n"
			+ " animals.breed, \n" + " animals.gender\n" + " FROM \n" + " shelter\n" + " LEFT JOIN animals ON\n"
			+ " shelter.shelter_id = animals.shelter_id";
	private static final String SELECT_ANIMAL_BY_ID = "select * from animals WHERE animal_id = ? ";
	private static final String INSERT_ANIMAL = "insert into animal (animal_name, animal_type, breed, gender) values(?, ?, ?, ?)";
	private static final String DELETE_ANIMAL = "delete from product where animal_id = ?";
	private static final String UPDATE_ANIMAL = "update animal set animal_name = ?, animal_type = ?, animal_breed = ?, animal_gender = ? where animal_id = ?";

	/**
	 * private static final String SELECT_ANIMAL_BY_CUSTOMER_ID = "select * from
	 * animals " + "JOIN customer ON " + + "customer.customer_id__=
	 * animals.customer_id";
	 * 
	 **/
	public List<ShelterWithAnimals> getAllAnimals() {
		List<ShelterWithAnimals> allSheltersWithAnimals = new ArrayList<>();
		try (PreparedStatement pstmt = conn.prepareStatement(SELECT_ALL_ANIMALS); ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {

				int shelter_id = rs.getInt("shelter_id");
				String shelter_name = rs.getString("shelter_name");
				String shelter_address = rs.getString("shelter_address");
				int animal_id = rs.getInt("animal_id");
				String animal_name = rs.getString("animal_name");
				String animal_type = rs.getString("animal_type");
				String breed = rs.getString("breed");
				String gender = rs.getString("gender");
				allSheltersWithAnimals.add(
						new ShelterWithAnimals(shelter_id, shelter_name, shelter_address, 
								animal_id, animal_name, animal_type, breed, gender));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allSheltersWithAnimals;
	}
}
