package com.esisa.projet.sport.models;

public class Membre {

	private int id;
	private String nom;
	private String prenom;
	private String genre;
	private String date;
	private String email;
	private String telephone;
	private String adresse;
	private String ville;
	
	public Membre(String nom, String prenom, String genre, String date, String email, String telephone, String adresse,
			String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.date = date;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getId() {
		return id;
	}
	
	
	
}