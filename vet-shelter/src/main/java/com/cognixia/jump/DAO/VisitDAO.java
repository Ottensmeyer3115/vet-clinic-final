package com.cognixia.jump.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.connection.ConnectionManager;
import com.cognixia.jump.model.Visit;

public class VisitDAO {

	public static final Connection conn = ConnectionManager.getConnection();

	private static final String SELECT_ALL_VISITS = "SELECT \n" + " shelter.shelter_name,\n"
			+ " shelter.shelter_address,\n" + " visits.visit_id, \n" + " visit.visit_date,\n" + " visit.shelter_id, \n"
			+ " FROM \n" + " shelter\n" + " LEFT JOIN visit ON\n" + " shelter.shelter_id = visit.shelter_id";

	public List<Visit> getAllVisits() {

		List<Visit> allVisits = new ArrayList<>();
	
		try (PreparedStatement pstmt = conn.prepareStatement(SELECT_ALL_VISITS); 
				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {

				int shelter_id = rs.getInt("shelter_id");
				String shelter = rs.getString("shelter_name");
				String shelter_address = rs.getString("shelter_address");
				int visit_id = rs.getInt("visit_id");
				String date = rs.getString("visit_date");
				String service_rendered = rs.getString("service_rendered");

				allVisits.add(new Visit(visit_id, date, service_rendered, shelter_id));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allVisits;
	}
}
