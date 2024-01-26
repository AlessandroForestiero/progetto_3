/*package it.epicode.entities;
import it.epicode.dao.ArticoloCartaceoDAO;
import it.epicode.dao.PrestitoDAO;
import it.epicode.dao.UtenteDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class NewArchivio {

    public class Archivio {
        private final EntityManagerFactory entityManagerFactory;
        private final EntityManager entityManager;
        private final ArticoloCartaceoDAO articoloCartaceoDAO;
        private final UtenteDAO utenteDAO;
        private final PrestitoDAO prestitoDAO;

        public Archivio() {
            entityManagerFactory = Persistence.createEntityManagerFactory("libreria_jpa");
            entityManager = entityManagerFactory.createEntityManager();
            articoloCartaceoDAO = new ArticoloCartaceoDAO();
            utenteDAO = new UtenteDAO();
            prestitoDAO = new PrestitoDAO();
        }

        public void chiudi() {
            entityManager.close();
            entityManagerFactory.close();
        }

        public ArticoloCartaceoDAO getArticoloCartaceoDAO() {
            return articoloCartaceoDAO;
        }

        public UtenteDAO getUtenteDAO() {
            return utenteDAO;
        }

        public PrestitoDAO getPrestitoDAO() {
            return prestitoDAO;
        }
    }
}*/
