package com.hibernate.jpa.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Just a= new Just();
    	a.setAid(8);
    	a.setAname("rithik");
    	a.setTech("operations");  
          EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
          EntityManager em= emf.createEntityManager();
          
//          Just a=em.find(Just.class, 2);   to fetch data from  database
          
          em.getTransaction().begin();
          em.persist(a);         // to insert data in to database
          em.getTransaction().commit();
        
          System.out.println(a);
    }
}
