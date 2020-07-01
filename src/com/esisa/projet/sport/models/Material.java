package com.esisa.projet.sport.models;

public class Material {
	private int id;
	private String name ;
	private String categorie ;
	private String marque ;
	private String poids ;
	private String dimensions ;
	
	public Material() {
		
	}

	public Material(int id, String name, String categorie, String marque, String poids, String dimensions) {
		super();
		this.id = id;
		this.name = name;
		this.categorie = categorie;
		this.marque = marque;
		this.poids = poids;
		this.dimensions = dimensions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getPoids() {
		return poids;
	}

	public void setPoids(String poids) {
		this.poids = poids;
	}

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	
}
