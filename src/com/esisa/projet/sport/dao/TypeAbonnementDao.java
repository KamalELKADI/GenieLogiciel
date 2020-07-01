package com.esisa.projet.sport.dao;

import java.util.List;

import com.esisa.projet.sport.models.TypeAbonnement;

public interface TypeAbonnementDao {

	public List<TypeAbonnement> select();
	public boolean insert(TypeAbonnement t);
	public List<TypeAbonnement> select(String type);
	
}

