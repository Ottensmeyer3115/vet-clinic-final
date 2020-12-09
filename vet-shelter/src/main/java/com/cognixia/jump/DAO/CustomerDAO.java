package com.cognixia.jump.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognixia.jump.connection.ConnectionManager;
import com.cognixia.jump.model.Customer;

public class CustomerDAO {

	public static final Connection conn = ConnectionManager.getConnection();

	private static final String SELECT_ALL_CUSTOMERS = "select * from customer";
	private static final String SELECT_CUSTOMER_BY_ID = "select * from customers WHERE customer_id = ? ";
	private static final String INSERT_CUSTOMER = "insert into customer (customer_id, customer_name, customer_address, visit_id) values(?, ?, ?, ?)";
	private static final String DELETE_CUSTOMER = "delete from customer where customer_id = ?";
	private static final String UPDATE_CUSTOMER = "update customer set customer_name = ?, customer_address = ?, visit_id = ? where customer_id = ?";

	public List<Customer> getAllCustomers() {

		List<Customer> allCustomers = new ArrayList<Customer>();

		try (PreparedStatement pstmt = conn.prepareStatement(SELECT_ALL_CUSTOMERS);

				ResultSet rs = pstmt.executeQuery()) {

			while (rs.next()) {

				int id = rs.getInt("customer_id");
				String name = rs.getString("customer_name");
				String address = rs.getString("customer_address");
				int visit_id = rs.getInt("visit_id");

				allCustomers.add(new Customer(id, name, address, visit_id));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return allCustomers;
	}

	public Customer getCustomerById(int id) {

		Customer customer = null;

		try (PreparedStatement pstmt = conn.prepareStatement(SELECT_CUSTOMER_BY_ID)) {

			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			// if Animal found, if statement run, if not null returned as Animal
			if (rs.next()) {
				String name = rs.getString("customer_name");
				String address = rs.getString("customer_address");
				int visit_id = rs.getInt("visit_id");

				customer = new Customer(id, name, address, visit_id);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;
	}

	public boolean addCusotmer(Customer customer) {

		try (PreparedStatement pstmt = conn.prepareStatement(INSERT_CUSTOMER)) {

			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setInt(3, customer.getVisit_id());

			// at least one row added
			if (pstmt.executeUpdate() > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean deleteCustomer(int id) {
		try (PreparedStatement pstmt = conn.prepareStatement(DELETE_CUSTOMER)) {
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

	public boolean updateCusomter(Customer customer) {
		try (PreparedStatement pstmt = conn.prepareStatement(UPDATE_CUSTOMER)) {

			pstmt.setInt(1, customer.getId());
			pstmt.setString(2, customer.getName());
			pstmt.setString(3, customer.getAddress());
			pstmt.setInt(4, customer.getVisit_id());
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
