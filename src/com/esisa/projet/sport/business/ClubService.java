package com.esisa.projet.sport.business;

import java.util.List;

import com.esisa.projet.sport.models.Material;
import com.esisa.projet.sport.models.Membre;
import com.esisa.projet.sport.models.Moniteur;
import com.esisa.projet.sport.models.TypeAbonnement;


public interface ClubService {
	public List<Material> materiels();
	public boolean ajouterMaterial(Material m);
	///////////////////////////////////////////
	public List<TypeAbonnement> types();
	public boolean ajouterTypeAbonnement(TypeAbonnement t);
	
	public List<Membre> membres();
	public boolean ajouterMembre(Membre m);
	public boolean ajouterMoniteur(Moniteur moniteur);
	public List<Moniteur> moniteurs();
}
