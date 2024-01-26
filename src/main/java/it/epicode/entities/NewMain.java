package it.epicode.entities;

import it.epicode.dao.ArticoloCartaceoDAO;
import it.epicode.dao.PrestitoDAO;
import it.epicode.dao.UtenteDAO;


public class NewMain {
    public static void main(String[] args) {


        ArticoloCartaceoDAO articoloCartaceoDAO = new ArticoloCartaceoDAO();
        ArticoloCartaceo articoloCartaceo = new ArticoloCartaceo() {};
        articoloCartaceoDAO.aggiungiElementoCatalogo(articoloCartaceo);

       /* UtenteDAO utenteDAO = new UtenteDAO();
        Utente utente = new Utente();
        utenteDAO.inserisciUtente(utente);
        PrestitoDAO prestitoDAO = new PrestitoDAO();
        Prestito prestito = new Prestito();
    }
*/
}}
