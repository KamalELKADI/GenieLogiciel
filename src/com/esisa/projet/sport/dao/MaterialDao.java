package com.esisa.projet.sport.dao;

import java.util.List;

import com.esisa.projet.sport.models.Material;


public interface MaterialDao {
	public List<Material> select(); // select all
	public boolean insert(Material m);
	public List<Material> select(String material);
}
