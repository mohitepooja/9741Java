package com.demo.MTOMapping;
import java.util.*;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.MTOMapping.entity.Library;
import com.demo.MTOMapping.entity.Student;



public class MTOEx 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory( "books_issued" );  
         EntityManager em = emf.createEntityManager( );  
         em.getTransaction( ).begin( );  
        
         Library lib=new Library();  
	        //lib.setB_id(101);  
	        lib.setB_name("Data Structure");  
	          
	        em.persist(lib);  
	          
	        Student st1=new Student();  
	        //st1.setS_id(1);  
	        st1.setS_name("Pooja");  
	       st1.setLib(lib);  
	      
	          
	        Student st2=new Student();  
	        //st2.setS_id(2);  
	        st2.setS_name("Pranjali");  
	        st2.setLib(lib);  
           
         em.persist(st1);  
         em.persist(st2);  
       
         em.getTransaction().commit();  
           
        em.close();  
         emf.close();    
    }
}
