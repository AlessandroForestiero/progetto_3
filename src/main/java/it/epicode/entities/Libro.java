package it.epicode.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "libri")
public class Libro extends ArticoloCartaceo {
    private String autore;
    private String genere;


    public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(isbn,titolo,annoPubblicazione,numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

      @Override
    public String toString() {
        return  "isbn: " + this.getIsbn()+
                " titolo: " + this.getTitolo() +
                " Anno di pubblicazione : " + this.getAnnoPubblicazione() +
                " numero di pagine : " + this.getNumeroPagine() +
                " autore: " + this.autore +
                " genere : " + this.genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
