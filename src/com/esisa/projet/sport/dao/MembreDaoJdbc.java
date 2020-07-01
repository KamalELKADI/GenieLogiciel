package com.esisa.projet.sport.dao;

import java.util.List;
import java.util.Vector;

import com.esisa.projet.sport.jdbc.Database;
import com.esisa.projet.sport.models.Membre;

public class MembreDaoJdbc implements MembreDao{

	private Database db;
	
	
	public MembreDaoJdbc(Database db) {
		super();
		this.db = db;
	}


	public List<Membre> select() {
		return mapping(db.select("membre"));
	}

	
	public boolean insert(Membre m) {
		if (db.insert("membre",m.getId(),m.getNom(),m.getPrenom(),m.getGenre(),m.getDate(),m.getEmail(),m.getTelephone(),m.getAdresse(),m.getVille()) > 0) return true;
		return false;
	}

	public List<Membre> select(String type) {
		return null;
	}
	
	
	public List<Membre> mapping(String data[][]){
		Vector<Membre> membre = new Vector<>();
		
		return membre;
	}

}
