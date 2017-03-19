package com.atos.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PERSONNE")
@SequenceGenerator(name="PERSONNE_SEQUENCE",sequenceName="PERSONNE_SEQ")
public class Personne {

	@Id
	@GeneratedValue
	private int  id_Personne;
	private String nom;
	private String prenom;
	@ManyToMany
	@JoinTable(name="PERSONNE_APPLICATION", 
	  joinColumns=@JoinColumn(name="ID_PERSONNE"),
	  inverseJoinColumns=@JoinColumn(name="ID_APPLICATION"))
	
	private Set<Application> applications= new HashSet<Application>();
	
	@OneToMany(mappedBy="personne")
	private Set<Compte> comptes = new HashSet<Compte>();
	public Set<Application> getApplications() {
		return applications;
	}
	public void setApplications(Set<Application> applications) {
		this.applications = applications;
	}
	public Set<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}
	public Personne(String nom, String prenom, String date_naissance,
			String cIN, String das, String taille) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
		CIN = cIN;
		this.das = das;
		this.taille = taille;
	}
	public Personne() {
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	private String date_naissance  ;
	private String CIN ; 
	private String das ; 
	private String taille;
	
	@Override
	public String toString() {
		return "Personne [id_Personne=" + id_Personne + ", nom=" + nom + ", date_naissance=" + date_naissance + ", CIN="
				+ CIN + ", das=" + das + ", taille=" + taille + "]";
	}
	public int getId_Personne() {
		return id_Personne;
	}
	public void setId_Personne(int id_Personne) {
		this.id_Personne = id_Personne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public String getDas() {
		return das;
	}
	public void setDas(String das) {
		this.das = das;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
}
