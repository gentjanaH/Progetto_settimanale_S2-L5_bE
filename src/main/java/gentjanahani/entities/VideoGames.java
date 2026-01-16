package gentjanahani.entities;

import java.time.LocalDate;

public class VideoGames extends AllGames {
    //ATTRIBUTI
    private Piattaforma piattaforma;
    private Genere genere;

    //COSTRUTTORI
    public VideoGames(String title, LocalDate annoDiPubblicazione, Double price, Piattaforma piattaforma, Genere genere) {
        super(title, annoDiPubblicazione, price);
        this.piattaforma = piattaforma;
        this.genere = genere;
    }
    //METODI

    //GETTER E SETTER


    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Piattaforma getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(Piattaforma piattaforma) {
        this.piattaforma = piattaforma;
    }
}
