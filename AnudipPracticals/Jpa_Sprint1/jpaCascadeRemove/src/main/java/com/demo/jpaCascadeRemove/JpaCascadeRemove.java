package com.demo.jpaCascadeRemove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpaCascadeRemove.entity.studentEntity;

public class JpaCascadeRemove 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "jpaCascadePersist" );  
         
         EntityManager em = emf.createEntityManager( );  
       em.getTransaction().begin();  
 
          
         studentEntity s=em.find(studentEntity.class, 101);  
        em.remove(s);  
           
         
         em.getTransaction().commit();  
 
         em.close( );  
         emf.close( );  
    }
}
