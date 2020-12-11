package com.cognixia.jump.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognixia.jump.DAO.ShelterDAO;
import com.cognixia.jump.model.Animal;

@WebServlet("/home")
public class shelterServlet extends HttpServlet {

	private static final long serialVersionUID = -2629014217895122813L;

	private ShelterDAO shelterDao;

	@Override
	public void init() {
		shelterDao = new ShelterDAO();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doGet(req, res);

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// depending on ending url path will redirect our servlet to complete one of the
		// actions in the switch case below:

		String action = req.getServletPath();
		System.out.println(action);

		switch (action) {

		case "/list":
			listAnimals(req, res);
			break;

		case "/delete":
			deleteAnimal(req, res);
			break;

		case "/edit":
			goToEditAnimalForm(req, res);
			break;

		case "/update":
			editAnimal(req, res);
			break;

		case "/new":
			goToNewAnimalForm(req, res);
			break;

		case "/insert":
			addNewAnimal(req, res);
			break;
		default:

		}

	}

	@Override
	public void destroy() {

	}

	private void listAnimals(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// Servlet is our controller - get data from Model to controller
		List<Animal> allAnimals = shelterDao.getAllAnimals();

		System.out.println("called, allAnimals = " + allAnimals);
		// From the controller to request Object which goes to View

		req.setAttribute("allAnimals", allAnimals);

		RequestDispatcher dispatcher = req.getRequestDispatcher("animal-list.jsp");

		dispatcher.forward(req, res);
	}

	private void deleteAnimal(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));

		shelterDao.deleteAnimal(id);

		res.sendRedirect("list");

	}

	private void goToEditAnimalForm(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		Animal animal = shelterDao.getAnimalById(id);

		req.setAttribute("animal", animal);

		RequestDispatcher dispatcher = req.getRequestDispatcher("clinic-form.jsp");

	}

	private void editAnimal(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String breed = req.getParameter("breed ");
		String gender = req.getParameter("gender");
		int shelter_id = Integer.parseInt(req.getParameter("shelter_id"));

		Animal animal = new Animal(id, name, type, breed, gender, shelter_id, 1);

		shelterDao.updateAnimal(animal);

		res.sendRedirect("list");
	}

	private void goToNewAnimalForm(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("animal-form.jsp");
		dispatcher.forward(req, res);
	}

	private void addNewAnimal(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String breed = req.getParameter("breed");
		String gender = req.getParameter("gender");
		System.out.println("shelter= " + req.getParameter("shelter"));
		int shelter_id = Integer.parseInt(req.getParameter("shelter"));
		Animal animal = new Animal(10, name, type, breed, gender, shelter_id, 1);

		if (shelterDao.addAnimal(animal)) {
			System.out.println("CREATED ANIMAL" + " as\n" + animal);
		}

		

		res.sendRedirect("list");
	}
}
