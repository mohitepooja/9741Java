package com.demo.JPACrudEx;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.demo.JPACrudEx.entity.Player;


public class JPACrud 
{
    public static void main( String[] args )
    {
//    	JPACrud.createRecord();
//        JPACrud.retrieveRecord();
//        JPACrud.updateRecord();
//        JPACrud.deleteRecord();
//        JPACrud.queryRecord();
        JPACrud.findByNamedQueryRecord();
//    	JPACrud.findByFuzzyNamedQueryRecord();
        
        
    }

	private static void findByFuzzyNamedQueryRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Crud");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();

		Query query=  entityManager.createNamedQuery("Player.findByFuzzyEmail");
		query.setParameter("email", "%jam%");
		List<Player> players = query.getResultList();

		for (Player playa : players) {
			System.out.println(playa);
		}

		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			System.out.println(player.getLoginName());
		}
		entityManager.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	private static void findByNamedQueryRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Crud");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();

		Query query=  entityManager.createNamedQuery("Player.findByEmail");
		
		query.setParameter("email", "deepikav@gmail.com");
		List<Player> players = query.getResultList();
		

		for (Player playa : players) {
			System.out.println(playa);
		}

		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			System.out.println(player.getLoginName());
		}
		
		entityManager.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

	private static void queryRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Crud");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();

		Query query = entityManager.createQuery("select distinct p from Player as p", Player.class);
		

		List<Player> players = query.getResultList();

		for (Player playa : players) {
			System.out.println("The password is :" + playa.getPassword());
		}

		for (int i = 0; i < players.size(); i++) {
			Player player = players.get(i);
			System.out.println("The name is = "+player.getLoginName());
		}
		entityManager.flush();
		//entityManager.detach(arg0);h();
		entityManager.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

	private static void deleteRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Crud");
		EntityManager entityManager = emf.createEntityManager();
		entityManager.getTransaction().begin();

		Long key = Long.valueOf(12);
		Player p = entityManager.find(Player.class, key);
		entityManager.remove(p); // record is deleted
        System.out.println("record deleted");
		entityManager.getTransaction().commit();
		// TODO Auto-generated method stub
		
	}

	private static void updateRecord() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Crud");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin(); 

		Long key = Long.valueOf(1);
		Player p = em.find(Player.class, Long.valueOf(1));
		p.setPassword("kowabunga");
		System.out.println("Update method = ");
		System.out.println(p.getPassword()+"\t"+p.getLoginName());

		em.getTransaction().commit();
		em.close();
		emf.close();
		// TODO Auto-generated method stub
		
	}

	private static void retrieveRecord() {
		try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Crud");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Long key = Long.valueOf(1);
		Player p = em.find(Player.class, key);
		System.out.println("Retrieve method = ");
		System.out.println(p.getPassword()+"\t"+p.getLoginName());

		em.getTransaction().commit();
		em.close();
		emf.close();		// TODO Auto-generated method stub
		
	}
		catch(Exception e) {}
	}
	private static void createRecord() {
		try {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_Crud");  
	    EntityManager em=emf.createEntityManager();  
	      
	    em.getTransaction().begin();  
		// TODO Auto-generated method stub
	    Player p1=new Player();
	    p1.setLoginName("Pooja");
	    p1.setEmailAddress("poojamohite@gmail.com");
	    p1.setPassword("pooja@123");
	    p1.setRegistrationDate(new java.util.GregorianCalendar(2017,05,21));
	    p1.setLastAccessTime(new java.util.Date());
	    p1.setVerified(true);
	    Player p2=new Player();
	    p2.setLoginName("Pranjali");
	    p2.setEmailAddress("pranjalitambe@gmail.com");
	    p2.setPassword("pranjali@123");
	    p2.setRegistrationDate(new java.util.GregorianCalendar(2017,05,21));
	    p2.setLastAccessTime(new java.util.Date());
	    p2.setVerified(true);
	    Player p3=new Player();
	    p3.setLoginName("Poonam");
	    p3.setEmailAddress("poonamkachre@gmail.com");
	    p3.setPassword("poonam@123");
	    p3.setRegistrationDate(new java.util.GregorianCalendar(2017,05,21));
	    p3.setLastAccessTime(new java.util.Date());
	    p3.setVerified(true);
	    Player p4=new Player();
	    p4.setLoginName("Deepika");
	    p4.setEmailAddress("deepikav@gmail.com");
	    p4.setPassword("deepika@123");
	    p4.setRegistrationDate(new java.util.GregorianCalendar(2017,05,21));
	    p4.setLastAccessTime(new java.util.Date());
	    p4.setVerified(true);
	    em.persist(p1);
	    em.persist(p2);
	    em.persist(p3);
	    em.persist(p4);
	    Query query =  em.createQuery("Select p1 from Player p1");
	    @SuppressWarnings("unchecked")
	    List<Player> list =query.getResultList();  
        System.out.println("Player details :");  
        for(Player s:list) {  
              
           System.out.println(s.getLoginName()+"\t"+s.getEmailAddress()+"\t"+s.getPassword()+"\t"+s.getRegistrationDate());  
        
             
        }
	    em.getTransaction().commit();
	   
	    em.close();  
	    emf.close();  
		}
		catch(Exception e) {}
	}
}
