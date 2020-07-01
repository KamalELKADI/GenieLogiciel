package com.esisa.projet.sport.dao;

import java.util.List;

import com.esisa.projet.sport.models.Membre;

public interface MembreDao {

	public List<Membre> select();
	public boolean insert(Membre m);
	public List<Membre> select(String type);
}
