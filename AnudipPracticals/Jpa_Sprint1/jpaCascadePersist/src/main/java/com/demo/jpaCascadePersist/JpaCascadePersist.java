package com.demo.jpaCascadePersist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.jpaCascadePersist.entity.studentEntity;
import com.demo.jpaCascadePersist.entity.subject;



public class JpaCascadePersist 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory( "jpaCascadePersist" );  
         
         EntityManager em = emf.createEntityManager( );  
       em.getTransaction().begin();  
 
          
         studentEntity s1=new studentEntity();  
         s1.setS_id(101);  
         s1.setS_name("Vipul");  
         s1.setS_age(20);  
           
         studentEntity s2=new studentEntity();  
         s2.setS_id(102);  
         s2.setS_name("Aman");  
         s2.setS_age(22);  
           
         subject sb1=new subject();  
         sb1.setName("ENGLISH");  
         sb1.setMarks(80);  
           sb1.setS_id(s1.getS_id());  
             
           subject sb2=new subject();  
         sb2.setName("Maths");  
         sb2.setMarks(75);  
             sb2.setS_id(s2.getS_id());  
           
         s1.setSub(sb1);  
         s2.setSub(sb2);  
           
             
           
         em.persist( s1 );//No need to perform persist operation separately for different entities.  
         em.persist(s2);  
         
         em.getTransaction().commit();  
 
         em.close( );  
         emf.close( );  
    }	
}
