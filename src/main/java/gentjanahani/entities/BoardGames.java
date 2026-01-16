package gentjanahani.entities;

import java.time.LocalDate;

public class BoardGames extends AllGames {
    //ATTIBUTI
    private int numeroGiocatori;
    private int durataInMin;

    //COSTRUTTORI
    public BoardGames(long idGame, String title, LocalDate annoDiPubblicazione, Double price, int numeroGiocatori, int durataInMin) {
        super(idGame, title, annoDiPubblicazione, price);
        this.numeroGiocatori = numeroGiocatori;
        this.durataInMin = durataInMin;
    }

    //METODI
    
    //GETTER

}
