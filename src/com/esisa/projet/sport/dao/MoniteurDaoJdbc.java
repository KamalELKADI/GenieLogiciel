package com.esisa.projet.sport.dao;

import java.util.List;
import java.util.Vector;

import com.esisa.projet.sport.jdbc.Database;
import com.esisa.projet.sport.models.Membre;
import com.esisa.projet.sport.models.Moniteur;

public class MoniteurDaoJdbc implements MoniteurDao{

private Database db;
	
	
	public MoniteurDaoJdbc(Database db) {
		super();
		this.db = db;
	}


	public List<Moniteur> select() {
		return mapping(db.select("moniteur"));
	}

	
	public boolean insert(Moniteur m) {
		if (db.insert("moniteur",m.getId(),m.getNom(),m.getPrenom(),m.getGenre(),m.getDate(),m.getSpecialite(),m.getVille(),m.getAdresse(),m.getTelephone(),m.getEmail(),m.getUsername(),m.getPassword(),m.getPhoto(),m.getCv()) > 0) return true;
		return false;
	}


	
	
	public List<Moniteur> mapping(String data[][]){
		Vector<Moniteur> moniteur = new Vector<>();
		for (int i = 0; i < data.length; i++) {
			int yp = 0;
			try {
				yp = Integer.parseInt(data[i][2]);
			}
			catch(Exception e) {}
			moniteur.add(new Moniteur(data[i][1], data[i][2],data[i][3],data[i][4],data[i][5],data[i][6],data[i][7],data[i][8],data[i][9],data[i][10],data[i][11],data[i][12],data[i][13]));
		}
		return moniteur;
	}

}
