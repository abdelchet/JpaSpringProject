package com.atos.bean;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Compte {

	@Id
	@GeneratedValue
    
	private int  id_Compte;
	@ManyToOne(cascade=CascadeType.ALL)
	private Personne personne;
	private String numero_compte ;
	private String rib ; 
	private Date date_creation  ;
	private Double solde;
	
	@Override
	public String toString() {
		return "Compte [id_Compte=" + id_Compte + ", personne=" + personne + ", numero_compte=" + numero_compte
				+ ", rib=" + rib + ", date_creation=" + date_creation + ", solde=" + solde + "]";
	}
	public int getId_Compte() {
		return id_Compte;
	}
	public void setId_Compte(int id_Compte) {
		this.id_Compte = id_Compte;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public String getNumero_compte() {
		return numero_compte;
	}
	public void setNumero_compte(String numero_compte) {
		this.numero_compte = numero_compte;
	}
	public String getRib() {
		return rib;
	}
	public void setRib(String rib) {
		this.rib = rib;
	}
	public Date getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(Date date_creation) {
		this.date_creation = date_creation;
	}
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde = solde;
	}
	public Compte( String numero_compte, String rib, Double solde) {
		super();
		
		this.numero_compte = numero_compte;
		this.rib = rib;
		this.solde = solde;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
