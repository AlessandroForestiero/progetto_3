package it.epicode.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Old {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libro l= new Libro("883010471X", "il signore degli anelli", 2000, 500, "tolkien", "fantasy");
        Libro l1=new Libro("8883379079", "1984", 1990, 500, "tolkien", "fantasy");
        Libro l2=new Libro("8854172383", "il piccolo principe", 1980, 500, "tolkien", "fantasy");
        Libro l3= new Libro("880790084X", "orgoglio e pregiudizio", 2005, 500, "tolkien", "fantasy");
        Libro l4=new Libro("880474667X", "il codice da vinci", 2012, 500, "tolkien", "fantasy");
        Libro l5= new Libro("8804750782", "il trono di spade", 2015, 500, "tolkien", "fantasy");
        Libro l6= new Libro("8806216465", "norwegian", 2020, 500, "tolkien", "fantasy");
        Libro libro8 = new Libro("8845296490", "sapiens", 2000, 500, "tolkien", "fantasy");
        Libro libro9 = new Libro("9788831003827", "harry potter", 2006, 500, "tolkien", "fantasy");
        List<Libro> listaDeiLibri = new ArrayList<>();
     /* int scelta=-1;
        do {
            System.out.println("1-aggiungi elemento,2-rimuovi un elemento,3-ricerca per isbn,4-ricerca per autore,5-salva,6-carica dal disco");
            scelta = scanner.nextInt();
            switch (scelta) {
                case 0:
                    System.out.println("Arrivederci");
                    break;
                case 1:
                    System.out.println("Inserisci codice ISBN:");
                    String nuovoIsbn = scanner.next();
                    System.out.println("Inserisci titolo:");
                    String nuovoTitolo = scanner.next();
                    System.out.println("Inserisci anno di pubblicazione:");
                    int nuovoAnno = scanner.nextInt();
                    System.out.println("Inserisci numero di pagine:");
                    int nuovoPagine = scanner.nextInt();
                    System.out.println("Inserisci autore:");
                    String nuovoAutore = scanner.next();
                    System.out.println("Inserisci genere:");
                    String nuovoGenere = scanner.next();

                    Libro nuovoLibro = new Libro(nuovoIsbn, nuovoTitolo, nuovoAnno, nuovoPagine, nuovoAutore, nuovoGenere);
                    listaDeiLibri.add(nuovoLibro);

                    System.out.println("Libro aggiunto con successo!");
                case 2:
                    System.out.println("inserisci il codice ISBN dell'elemento che vuoi eliminare");
                    String isbnremove=scanner.next();
                    if (listaDeiLibri. {
                                        }

            }
        } while (scelta != 0);
        System.out.println(listaDeiLibri);
    }*/
    }
}
