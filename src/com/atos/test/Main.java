package com.atos.test;


import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atos.bean.Application;
import com.atos.bean.Compte;
import com.atos.bean.Personne;
import com.atos.service.ApplicationService;
import com.atos.service.CompteService;
import com.atos.service.PersonneService;
import com.atos.service.impl.ApplicationServiceImpl;
import com.atos.service.impl.CompteServiceImpl;
import com.atos.service.impl.PersonneServiceImpl;

public class Main {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		
		PersonneService persService =(PersonneService) context.getBean("personneService");
		ApplicationService appService =(ApplicationService) context.getBean("applicationService");
		CompteService compteService =(CompteService) context.getBean("compteService");
	     // TextEditor te = (TextEditor) context.getBean("textEditor");
	    //  te.spellCheck();
    	//em.getTransaction().begin();
//		Personne personne = new Personne("badr","benzakour","test","test","test","test");
//		Personne personne2 = new Personne("younes","berkouk","test","test","test","test");
		Personne personne3 = new Personne("mohammed","amhend","test","test","test","test");
		Personne personne4 = new Personne("mohammed","Yassine","Samir","test","test","test");
		Personne personne5 = new Personne("Hamza","chehabi","test","test","test","test");
	//	EntityManager em = EntityManagerHelper.getFactory();
	//	EntityManagerFactory em =(EntityManagerFactory) context.getBean("entityManagerFactory");
	//	EntityManagerHelper.begin();
		
		persService.save(personne5);
		
//		ArrayList<Personne> array=  (ArrayList<Personne>) persService.findAll();
//		Iterator<Personne> iter = array.iterator();
//		while(iter.hasNext()){
//			System.out.println(iter.next());}
	
	//	Compte compte = new Compte( "12311223121","120120154998", 1800.d);
		//compte.setPersonne(personne3);
		
	//	compteService.save(compte);
//		System.out.println("Success");
		Application application = new Application();
		application.setNom_application("myApp3");
		Application application2 = new Application();
     	application2.setNom_application("myApp4");
	      appService.save(application);
		//applicationDao.save(application);
		//applicationDao.save(application2);
		//System.out.println(persService.findAll().toString());
		//PersonneDao persDao = new PersonneDaoImpl();
//		persDao.save(personne);
//		em.getTransaction().commit();

		
    }
}
