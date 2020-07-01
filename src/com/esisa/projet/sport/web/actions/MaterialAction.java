package com.esisa.projet.sport.web.actions;

import javax.servlet.http.HttpServletRequest;

import com.esisa.projet.sport.business.ClubService;
import com.esisa.projet.sport.dao.MaterialDao;
import com.esisa.projet.sport.dao.MaterialDaoJdbc;
import com.esisa.projet.sport.jdbc.DataSource;
import com.esisa.projet.sport.jdbc.Database;
import com.esisa.projet.sport.jdbc.MySQLDataSource;
import com.esisa.projet.sport.models.Material;

public class MaterialAction {
	private ClubService service;
	private MaterialDao dao;

	public MaterialAction(ClubService service) {
		super();
		this.service = service;
	}

	public ClubService getService() {
		return service;
	}

	public void setService(ClubService service) {
		this.service = service;
	}

	public String addMaterial(HttpServletRequest request) {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String categorie = request.getParameter("categorie");
		String marque = request.getParameter("marque");
		String poids = request.getParameter("poids");
		String dimensions = request.getParameter("dimensions");

		// Material m = new Material(id, name, categorie, marque, poids, dimensions);

		request.setAttribute("ajouterMaterial",
				service.ajouterMaterial(new Material(id, name, categorie, marque, poids, dimensions)));
		request.setAttribute("model", service.materiels());

		return "../views/listerMaterial.jsp";
	}

	public String listMateriel(HttpServletRequest request) {
		request.setAttribute("model", service.materiels());
		request.setAttribute("Message", "liste des Utilisateurs");
		return "../views/listerMaterial.jsp";
	}
}
