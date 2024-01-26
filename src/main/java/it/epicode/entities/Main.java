package it.epicode.entities;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Libro l = new Libro("1", "il signore degli anelli", 2000, 500, "tolkien", "fantasy");
        Libro l1 = new Libro("2", "1984", 1990, 500, "tolkien", "fantasy");
        Libro l2 = new Libro("3", "il piccolo principe", 1980, 500, "antonio", "fantasy");
        Libro l3 = new Libro("4", "orgoglio e pregiudizio", 2005, 500, "giovanni", "fantasy");
        Libro l4 = new Libro("5", "il codice da vinci", 2012, 500, "maruko", "fantasy");
        Libro l5 = new Libro("6", "il trono di spade", 2015, 500, "conte", "fantasy");
        Libro l6 = new Libro("7", "norwegian", 2020, 500, "trabol", "fantasy");
        Libro l7 = new Libro("8", "sapiens", 2000, 500, "pisca", "fantasy");
        Libro l8 = new Libro("9", "harry potter", 2006, 500, "oracolo", "fantasy");
        Rivista r = new Rivista("10", "focus", 1988, 30, Periodicita.SETTIMANALE);
        Rivista r1 = new Rivista("11", "cioe", 2000, 30, Periodicita.SETTIMANALE);
        Rivista r2 = new Rivista("12", "famiglia cristiana", 1990, 30, Periodicita.SETTIMANALE);
        Rivista r3 = new Rivista("13", "al volante", 1980, 30, Periodicita.SETTIMANALE);
        Rivista r4 = new Rivista("14", "quattro ruote", 1908, 30, Periodicita.SEMESTRALE);
        Rivista r5 = new Rivista("15", "Chi", 1888, 30, Periodicita.SEMESTRALE);
        Rivista r6 = new Rivista("16", "donna moderna", 1188, 30, Periodicita.MENSILE);
        Rivista r7 = new Rivista("17", "corriere dello sport", 1880, 30, Periodicita.MENSILE);
        List<ArticoloCartaceo> articoli = List.of(l, l1, l2, l3, l4, l5, l6, l7, l8, r, r1, r2, r3, r4, r5, r6, r7);
        Archivio archivio = new Archivio(articoli);
        archivio.rimuoviArticolo("8804750782");
        archivio.aggiungiArticolo(new Libro("00000", "provaAggiunto", 3000, 999, "prova", "prova"));
          System.out.println(archivio.ricercaPerIsbn("56453646455675"));
          System.out.println(archivio.ricercaPerAnno(2000));
          System.out.println(archivio.ricercaPerAutore("ciao"));
        try {
            archivio.salva();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(archivio);
        Archivio archivio2 = new Archivio();
        System.out.println(archivio2);
        try {
            archivio2.carica();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(archivio2);
    }
}
