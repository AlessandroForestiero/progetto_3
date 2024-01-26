/*package it.epicode.entities;


import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Archivio {
    Map<Integer, ArticoloCartaceo> articoloCartaceoMap = new HashMap<>();

    public Archivio() {

    }

    public Archivio(List<ArticoloCartaceo> articoli) {
        articoli.forEach(this::aggiungiArticolo);
    }

    public void aggiungiArticolo(ArticoloCartaceo articolo) {
        this.articoloCartaceoMap.put(articolo.getIsbn(), articolo);
    }

    public void rimuoviArticolo(String isbn) {
        this.articoloCartaceoMap.remove(isbn);
    }

    public ArticoloCartaceo ricercaPerIsbn(String isbn) {
        return this.articoloCartaceoMap.get(isbn);
    }

    public List<ArticoloCartaceo> ricercaPerAnno(int anno) {
        return this.articoloCartaceoMap.values().stream().filter(articolo -> articolo.getAnnoPubblicazione() == anno).collect(Collectors.toList());
    }

    public List<ArticoloCartaceo> ricercaPerAutore(String autore) {
        return this.articoloCartaceoMap.values().stream()
                .filter(libro -> libro.getClass().equals(Libro.class))
                .filter(libro -> ((Libro) libro).getAutore().equals(autore))
                .collect(Collectors.toList());
    }

    public void salva() throws IOException {

        String articoli = this.articoloCartaceoMap.values().stream()
                .map(articolo -> {
                    String temp = articolo.getIsbn() + "@" + articolo.getTitolo() + "@" + articolo.getAnnoPubblicazione() + "@" + articolo.getNumeroPagine() + "@";
                    if (articolo.getClass().equals(Libro.class)) {
                        return temp + ((Libro) articolo).getAutore() + "@" + ((Libro) articolo).getGenere() + "\n";
                    } else {
                        return temp + ((Rivista) articolo).getPeriodicita() + "\n";
                    }
                })
                .collect(Collectors.joining());
        BufferedWriter bw = new BufferedWriter(new FileWriter("archivio.txt"));
        bw.write(articoli);
        bw.close();
    }

    public void carica() throws IOException {
        this.articoloCartaceoMap = new HashMap<>();
        String rigaCorrente;
        BufferedReader br = new BufferedReader(new FileReader("archivio.txt"));
        while ((rigaCorrente = br.readLine()) != null) {
            String[] attributiArticolo = rigaCorrente.split("@");
            if (attributiArticolo.length == 6) {
                this.articoloCartaceoMap.put(attributiArticolo[0], new Libro(attributiArticolo[0], attributiArticolo[1], Integer.parseInt(attributiArticolo[2]),
                        Integer.parseInt(attributiArticolo[3]),
                        attributiArticolo[4], attributiArticolo[5]));
            } else {
                this.articoloCartaceoMap.put(
                        attributiArticolo[0],
                        new Rivista(attributiArticolo[0],
                                attributiArticolo[1],
                                Integer.parseInt(attributiArticolo[2]),
                                Integer.parseInt(attributiArticolo[3]),
                                Periodicita.valueOf(attributiArticolo[4])));
            }
        }
    }

    @Override
    public String toString() {
        return this.articoloCartaceoMap.toString();
    }
}*/
