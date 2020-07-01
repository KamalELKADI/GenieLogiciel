package com.esisa.projet.sport.dao;

import java.util.List;
import java.util.Vector;

import com.esisa.projet.sport.jdbc.Database;
import com.esisa.projet.sport.models.TypeAbonnement;

public class TypeAbonnementDaoJdbc implements TypeAbonnementDao{

	private Database db;
	
	public TypeAbonnementDaoJdbc() {
	}
	
	
	
	public TypeAbonnementDaoJdbc(Database db) {
		super();
		this.db = db;
	}



	public List<TypeAbonnement> select() {
		return mapping(db.select("type_abonnement"));
	}

	
	public boolean insert(TypeAbonnement t) {
		if (db.insert("type_abonnement",t.getId(),t.getNom(),t.getPrix(),t.getDuree(),t.getDescription()) > 0) return true;
		return false;
	}

	
	public List<TypeAbonnement> select(String type) {
		return null;
	}
	
	public List<TypeAbonnement> mapping(String data[][]){
		Vector<TypeAbonnement> type = new Vector<>();
		for (int i = 1; i < data.length; i++) {
			type.add(new TypeAbonnement(data[i][1], Double.parseDouble(data[i][2]), data[i][3], data[i][4]));
		}
		return type;
	}

}
