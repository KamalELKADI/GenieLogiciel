package com.esisa.projet.sport.business;

import java.util.List;

import com.esisa.projet.sport.dao.MaterialDao;
import com.esisa.projet.sport.dao.MembreDao;
import com.esisa.projet.sport.dao.MoniteurDao;
import com.esisa.projet.sport.dao.TypeAbonnementDao;
import com.esisa.projet.sport.models.Material;
import com.esisa.projet.sport.models.Membre;
import com.esisa.projet.sport.models.Moniteur;
import com.esisa.projet.sport.models.TypeAbonnement;

public class ClubServiceDefault implements ClubService {

	private MaterialDao materialDao;
	private TypeAbonnementDao typeAbonnementDao;
	private MembreDao membreDao;
	private MoniteurDao moniteurDao; //

	public ClubServiceDefault(MaterialDao materialDao) {
		super();
		this.materialDao = materialDao;
	}

	public ClubServiceDefault(MaterialDao materialDao, TypeAbonnementDao typeAbonnementDao, MembreDao membreDao,MoniteurDao moniteurDao) {
		super();
		this.materialDao = materialDao;
		this.typeAbonnementDao = typeAbonnementDao;
		this.membreDao = membreDao;
		this.moniteurDao=moniteurDao;
	}



	@Override
	public List<Material> materiels() {
		return materialDao.select();
	}

	@Override
	public boolean ajouterMaterial(Material m) {

		return materialDao.insert(m);
	}
	
	public List<TypeAbonnement> types() {
		return typeAbonnementDao.select();
	}

	
	public boolean ajouterTypeAbonnement(TypeAbonnement t) {
		return typeAbonnementDao.insert(t);
	}


	public List<Membre> membres() {
		return membreDao.select();
	}


	
	public boolean ajouterMembre(Membre m) {
		return membreDao.insert(m);
	}

	@Override
	public boolean ajouterMoniteur(Moniteur moniteur) {
		
		return moniteurDao.insert(moniteur);
	}

	@Override
	public List<Moniteur> moniteurs() {
		
		return moniteurDao.select();
	}

}
