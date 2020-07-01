package com.esisa.projet.sport.web.actions;

import javax.servlet.http.HttpServletRequest;

import com.esisa.projet.sport.business.ClubService;
import com.esisa.projet.sport.models.TypeAbonnement;

public class TypeAbonnementAction {

	private ClubService service;
	
	public TypeAbonnementAction(ClubService service) {
		super();
		this.service = service;
	}

	public ClubService getService() {
		return service;
	}

	public void setService(ClubService service) {
		this.service = service;
	}
	
	public String lister(HttpServletRequest request)
	{
		//les methodes d'actions return des string
		
		request.setAttribute("model",service.types());// la jsp va recuperer va avec  une getattribute 
		//request.setAttribute("message", "List de tous les types d'abonnements");
		return "/views/ListerTypeAbonnement.jsp";//cest lui qui vas s'occuper d'afficher sur une pag ehtml
	}
	
	public String addTypeAbonnement(HttpServletRequest request)
	{

		String nom = request.getParameter("nom");
		double prix = Double.parseDouble(request.getParameter("prix"));
		String duree = request.getParameter("duree");
		String description = request.getParameter("description");

		request.setAttribute("ajouterTypeAbonnement", service.ajouterTypeAbonnement(new TypeAbonnement(nom, prix, duree, description)));
		request.setAttribute("model",service.types());
		return "/views/Success.jsp";
	}
	
	
}
