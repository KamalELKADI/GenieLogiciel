package com.esisa.projet.sport.web.actions;

import javax.servlet.http.HttpServletRequest;

import com.esisa.projet.sport.business.ClubService;
import com.esisa.projet.sport.models.Membre;

public class MembreAction {
	
	private ClubService service;
	
	public MembreAction(ClubService service) {
		super();
		this.service = service;
	}

	public ClubService getService() {
		return service;
	}

	public void setService(ClubService service) {
		this.service = service;
	}
	public String membres(HttpServletRequest request)
	{
		//les methodes d'actions return des string
		
		request.setAttribute("model",service.membres());// la jsp va recuperer va avec  une getattribute 
		request.setAttribute("message", "List de tous les membres");
		return "/views/ListerMembre.jsp";//cest lui qui vas s'occuper d'afficher sur une pag ehtml
	}
	
	public String addMembre(HttpServletRequest request)
	{

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String genre = request.getParameter("genre");
		String date = request.getParameter("date");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String adresse = request.getParameter("adresse");
		String ville = request.getParameter("ville");

		request.setAttribute("ajouterMembre", service.ajouterMembre(new Membre(nom, prenom, genre, date,email,telephone,adresse,ville)));
		request.setAttribute("model",service.membres());
		
		return "/views/Success.jsp";
	}
	
	
}
