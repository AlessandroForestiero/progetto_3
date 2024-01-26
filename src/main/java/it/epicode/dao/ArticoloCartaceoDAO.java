package it.epicode.dao;

import it.epicode.entities.ArticoloCartaceo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import java.util.List;

public class ArticoloCartaceoDAO {
    private final EntityManager entityManager;
    private final EntityManagerFactory entityManagerFactory;

    public ArticoloCartaceoDAO() {
        entityManagerFactory= Persistence.createEntityManagerFactory("libreria_jpa");
        entityManager =entityManagerFactory.createEntityManager();
    }

    public void aggiungiElementoCatalogo(ArticoloCartaceo elemento) {
        entityManager.getTransaction().begin();
        entityManager.persist(elemento);
        entityManager.getTransaction().commit();
    }

    public void rimuoviElementoPerISBN(String isbn) {
        entityManager.getTransaction().begin();
        ArticoloCartaceoDAO elemento = entityManager.find(ArticoloCartaceoDAO.class, isbn);
        if (elemento != null) {
            entityManager.remove(elemento);
        }
        entityManager.getTransaction().commit();
    }

    public ArticoloCartaceo ricercaPerISBN(String isbn) {
        return entityManager.find(ArticoloCartaceo.class, isbn);
    }

    public List<ArticoloCartaceo> ricercaPerAnnoPubblicazione(int anno) {
        TypedQuery<ArticoloCartaceo> query = entityManager.createQuery(
                "SELECT e FROM ElementoCartaceo e WHERE e.annoPubblicazione = :anno", ArticoloCartaceo.class);
        query.setParameter("anno", anno);
        return query.getResultList();
    }

    public List<ArticoloCartaceo> ricercaPerAutore(String autore) {
        TypedQuery<ArticoloCartaceo> query = entityManager.createQuery(
                "SELECT e FROM ElementoCartaceo e WHERE e.autore = :autore",ArticoloCartaceo.class);
        query.setParameter("autore", autore);
        return query.getResultList();
    }

    public List<ArticoloCartaceo> ricercaPerTitolo(String titolo) {
        TypedQuery<ArticoloCartaceo> query = entityManager.createQuery(
                "SELECT e FROM ElementoCartaceo e WHERE e.titolo LIKE :titolo",ArticoloCartaceo.class);
        query.setParameter("titolo", "%" + titolo + "%");
        return query.getResultList();
    }
}
