package com.atos.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHelper {

   /* private static EntityManager em;
    private static EntityManagerFactory  emf;
    static {
        try {
         emf = Persistence.createEntityManagerFactory("JpaDB");
         em = emf.createEntityManager();
        } catch(ExceptionInInitializerError e) {
            throw e;
        }
    }

    public static EntityManager getFactory() {
       if(em == null || !em.isOpen())
    	   em = emf.createEntityManager();
    	   
    	return em;
    }

    public static void begin (){
    
    	em.getTransaction().begin();
    }
    public static void commit(){
    	em.getTransaction().commit();
    	
    	
    }
    public static void rollback(){
    	
    	em.getTransaction().rollback();
    }*/
}
