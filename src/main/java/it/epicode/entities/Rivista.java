package it.epicode.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "riviste")
public class Rivista extends ArticoloCartaceo {

    private Periodicita periodicita ;
    public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(isbn,titolo,annoPubblicazione,numeroPagine);
        this.periodicita=periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }
    @Override
    public String toString() {
        return  "isbn: " + this.getIsbn()+
                " titolo: " + this.getTitolo() +
                " Anno di pubblicazione : " + this.getAnnoPubblicazione() +
                " numero di pagine : " + this.getNumeroPagine() +
                " periodicità: " + this.periodicita;
    }
}
