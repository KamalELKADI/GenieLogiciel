package com.esisa.projet.sport.models;

public class Moniteur {
	private int id;
	private String nom;
	private String prenom;
	private String genre;
	private String date;
	private String specialite;
	private String ville;
	private String adresse;
	private String telephone;
	private String email;
	private String username;
	private String password;
	private String photo;
	private String cv;
	
	
	public Moniteur(String nom, String prenom, String genre, String date, String specialite, String ville,
			String adresse, String telephone, String email, String username, String password, String photo, String cv) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.date = date;
		this.specialite = specialite;
		this.ville = ville;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
		this.username = username;
		this.password = password;
		this.photo = photo;
		this.cv = cv;
	}
	public int getId() {
		return id;
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
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getCv() {
		return cv;
	}
	public void setCv(String cv) {
		this.cv = cv;
	}
	
	
}
