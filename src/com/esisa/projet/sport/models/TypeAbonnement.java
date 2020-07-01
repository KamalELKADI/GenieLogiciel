package com.esisa.projet.sport.models;

public class TypeAbonnement {
 
	private int id;
	private String nom;
	private double prix;
	private String duree;
	private String description;
	public TypeAbonnement(String nom, double prix, String duree, String description) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.duree = duree;
		this.description = description;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	
	
	
}
