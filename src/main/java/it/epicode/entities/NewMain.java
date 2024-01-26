package it.epicode.entities;

import it.epicode.dao.ArticoloCartaceoDAO;


public class NewMain {
    public static void main(String[] args) {


        ArticoloCartaceoDAO articoloCartaceoDAO=new ArticoloCartaceoDAO();
        Libro nuovoLibro=new Libro("1234567890", "Il mio libro", 2022, 200, "Autore del libro", "Genere del libro");
        articoloCartaceoDAO.aggiungiElementoCatalogo(nuovoLibro);

    }

}
