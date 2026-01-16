package gentjanahani.entities;

import java.time.LocalDate;

public class VideoGames extends AllGames {
    //ATTRIBUTI
    private Piattaforma piattaforma;
    private Genere genere;

    //COSTRUTTORI
    public VideoGames(long idGame, String title, LocalDate annoDiPubblicazione, Double price, Piattaforma piattaforma, Genere genere) {
        super(title, annoDiPubblicazione, price);
        this.piattaforma = piattaforma;
        this.genere = genere;
    }
    //METODI


}
