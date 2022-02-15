package com.demo.JPASports;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.JPASports.entity.Player;
import com.demo.JPASports.entity.Team;

public class sports 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("Player_details");
    		    EntityManager em = emf.createEntityManager();
    		    em.getTransaction().begin();

    		    Team team = new Team();
    		    Player p1 = new Player();
    		    Player p2 = new Player();

    		    em.persist(team);
    		    em.persist(p1);
    		    em.persist(p2);

    		    team.setName("Pickering Atoms");
    		    p1.setNickName("Lefty");
    		    p1.setTeam(team);
    		    p2.setNickName("Blinky");
    		    p2.setTeam(team);
    		    
    		    Team team1 = new Team();
    		    Player p3 = new Player();
    		    Player p4 = new Player();

    		    em.persist(team1);
    		    em.persist(p3);
    		    em.persist(p4);

    		    team1.setName("MMM");
    		    p3.setNickName("Billu");
    		    p3.setTeam(team1);
    		    p4.setNickName("Blinky");
    		    p4.setTeam(team1);
    		    em.getTransaction().commit();
    }
}
