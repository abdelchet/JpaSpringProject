package com.atos.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Application {

	@Id
	@GeneratedValue
	private int idApplication; 
	private String nom_application;
	private String description ; 
	private String url ; 
	private String admin_;
	@ManyToMany(mappedBy="applications")
	private Set<Personne> personnes = new HashSet<Personne>();
	@Override
	public String toString() {
		return "Application [idApplication=" + idApplication + ", nom_application=" + nom_application + ", description="
				+ description + ", url=" + url + ", admin_=" + admin_ + "]";
	}
	public int getIdApplication() {
		return idApplication;
	}
	public void setIdApplication(int idApplication) {
		this.idApplication = idApplication;
	}
	public String getNom_application() {
		return nom_application;
	}
	public void setNom_application(String nom_application) {
		this.nom_application = nom_application;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAdmin_() {
		return admin_;
	}
	public void setAdmin_(String admin_) {
		this.admin_ = admin_;
	}
	public Application(String nom_application, String description, String url, String admin_) {
		super();
		this.nom_application = nom_application;
		this.description = description;
		this.url = url;
		this.admin_ = admin_;
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Set<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(Set<Personne> personnes) {
		this.personnes = personnes;
	} 
	
}
