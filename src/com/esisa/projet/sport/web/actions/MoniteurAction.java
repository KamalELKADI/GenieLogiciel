package com.esisa.projet.sport.web.actions;

import javax.servlet.http.HttpServletRequest;

import com.esisa.projet.sport.business.ClubService;

import com.esisa.projet.sport.dao.MoniteurDao;
import com.esisa.projet.sport.models.Moniteur;


public class MoniteurAction {
	private ClubService service;
	private MoniteurDao dao;

	public MoniteurAction(ClubService service) {
		super();
		this.service = service;
	}

	public ClubService getService() {
		return service;
	}

	public void setService(ClubService service) {
		this.service = service;
	}

	public String addMoniteur(HttpServletRequest request) {

		//int id = Integer.parseInt(request.getParameter("id"));
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String genre = request.getParameter("genre");
		String date = request.getParameter("date");
		String specialite = request.getParameter("specialite");
		String ville = request.getParameter("ville");
		String adresse = request.getParameter("adresse");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String pass = request.getParameter("pass");
		String photo = request.getParameter("photo");
		String cv = request.getParameter("cv");





		// Material m = new Material(id, name, categorie, marque, poids, dimensions);

		request.setAttribute("AjouterMoniteur",
				service.ajouterMoniteur(new Moniteur(nom, prenom, genre, date, specialite, ville, adresse, tel, email, username, pass, photo, cv)));
		//request.setAttribute("model", service.moniteurs());

		return "../views/listerMoniteur.jsp";
	}

	public String listMateriel(HttpServletRequest request) {
		request.setAttribute("model", service.materiels());
		request.setAttribute("Message", "liste des Utilisateurs");
		return "../views/listerMoniteur.jsp";
	}
	
	public String listerMoniteur(HttpServletRequest request) {
		request.setAttribute("model", service.moniteurs());
		System.out.println(service.moniteurs());
		request.setAttribute("Message", "liste des Moniteurs");
		return "../views/listerMoniteur.jsp";
	}

}
