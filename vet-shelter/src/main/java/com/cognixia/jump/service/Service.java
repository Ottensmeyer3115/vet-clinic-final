package com.cognixia.jump.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cognixia.jump.DAO.CustomerDAO;
import com.cognixia.jump.DAO.ShelterDAO;
import com.cognixia.jump.DAO.VisitDAO;
import com.cognixia.jump.model.Animal;


public class Service {

	  private final ShelterDAO shelterDao = new ShelterDAO();
	  private final CustomerDAO customerDao = new CustomerDAO();
	  private final VisitDAO visitDao = new VisitDAO();
	  //private final AnimalDAO animalDao;
	  
	  

	  /**
	  public Service(ShelterDAO shelterDao, CustomerDAO customerDao, VisitDAO visitDao, AnimalDAO animalDao) {
	    this.shelterDao = shelterDao;
	    this.customerDao = customerDao;
	    this.visitDao = visitDao;
	    this.animalDao = animalDao;
	  }
	  **/

	  /**
	  public String getAll() {
		  
		  Stream<String> combinedStream = Stream.concat;
				  .concat(
				  shelterDao.getAllAnimals().stream(),
				  customerDao.getAllCustomers().stream(),
				  visitDao.getAllVisits().stream());
				
		 
	  
	  }
	  **/
	  
}
