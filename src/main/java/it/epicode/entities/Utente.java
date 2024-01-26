package it.epicode.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "utenti")
public class Utente {
    private String nome;
    private  String cognome;
    @Column(name = "data_di_nascita")
    private LocalDate dataDiNascita;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "numero_di_tessera")
    private int numeroDiTessera;
    @OneToMany(mappedBy = "utente")
    private List<Prestito> prestiti=new ArrayList<>();

    public Utente() {
    }

    public Utente(String nome, String cognome, LocalDate dataDiNascita, int numeroDiTessera) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.numeroDiTessera = numeroDiTessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public int getNumeroDiTessera() {
        return numeroDiTessera;
    }

    public void setNumeroDiTessera(int numeroDiTessera) {
        this.numeroDiTessera = numeroDiTessera;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", numeroDiTessera=" + numeroDiTessera +
                '}';
    }
}
