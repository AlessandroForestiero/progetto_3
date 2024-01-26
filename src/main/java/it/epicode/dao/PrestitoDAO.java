package it.epicode.dao;

import it.epicode.entities.Prestito;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;


import java.util.List;

public class PrestitoDAO {
    private EntityManagerFactory emf;
private EntityManager em;
    public PrestitoDAO() {
        emf = Persistence.createEntityManagerFactory("libreria_jpa");
        em=emf.createEntityManager();
    }

    public void effettuaPrestito(Prestito prestito) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(prestito);
        em.getTransaction().commit();
        em.close();
    }
    public List<Prestito> recuperaPrestitiPerUtente(String numeroTessera) {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Prestito> query = em.createQuery("SELECT p FROM Prestito p WHERE p.utente.numeroTessera = :numeroTessera", Prestito.class);
        query.setParameter("numeroTessera", numeroTessera);
        List<Prestito> prestiti = query.getResultList();
        em.close();
        return prestiti;
    }
    public List<Prestito> recuperaPrestitiScaduti() {
        EntityManager em = emf.createEntityManager();
        TypedQuery<Prestito> query = em.createQuery("SELECT p FROM Prestito p WHERE p.dataRestituzionePrevista < CURRENT_DATE", Prestito.class);
        List<Prestito> prestiti = query.getResultList();
        em.close();
        return prestiti;
    }
}