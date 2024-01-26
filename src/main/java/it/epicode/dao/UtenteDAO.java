package it.epicode.dao;

import it.epicode.entities.Utente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class UtenteDAO {
    private EntityManagerFactory emf;
    private  EntityManager em;
    public UtenteDAO() {
        emf = Persistence.createEntityManagerFactory("libreria_jpa");
        em=emf.createEntityManager();
    }

    public void inserisciUtente(Utente utente) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(utente);
        em.getTransaction().commit();
        em.close();
    }
}