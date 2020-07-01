package com.esisa.projet.sport.dao;

import java.util.List;
import java.util.Vector;

import com.esisa.projet.sport.jdbc.Database;
import com.esisa.projet.sport.models.Material;

public class MaterialDaoJdbc implements MaterialDao {
	private Database db;
	
	public MaterialDaoJdbc() {
		
	}

	public MaterialDaoJdbc(Database db) {
		super();
		this.db = db;
	}

	
	public List<Material> select() {
		return mapping(db.select("material"));
	}

	
	public boolean insert(Material m) {
		if(db.insert("material",m.getId(),m.getName(),m.getCategorie(),m.getMarque(),m.getPoids(),m.getDimensions()) >0 ) return true;
		
		return false;
	}

	
	public List<Material> select(String material) {
		return null;
	}

	public List<Material> mapping(String data[][]){
		Vector<Material> material = new Vector<>();
		for (int i = 0; i < data.length; i++) 
		{
			material.add(new Material(Integer.parseInt(data[i][0]), data[i][1], data[i][2], data[i][3], data[i][4], data[i][5]));
		}
		
		return material;
	}
}
