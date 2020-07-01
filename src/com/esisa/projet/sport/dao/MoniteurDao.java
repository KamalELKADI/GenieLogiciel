package com.esisa.projet.sport.dao;

import java.util.List;

import com.esisa.projet.sport.models.Membre;
import com.esisa.projet.sport.models.Moniteur;

public interface MoniteurDao {
	
	public List<Moniteur> select();
	public boolean insert(Moniteur m);
}
