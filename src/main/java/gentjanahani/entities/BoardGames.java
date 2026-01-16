package gentjanahani.entities;

import java.time.LocalDate;

public class BoardGames extends AllGames {
    //ATTIBUTI
    private int numeroGiocatori;
    private int durataInMin;

    //COSTRUTTORI
    public BoardGames(String title, LocalDate annoDiPubblicazione,
                      Double price, int numeroGiocatori, int durataInMin) {
        super(title, annoDiPubblicazione, price);

        if (numeroGiocatori < 2 || numeroGiocatori > 10)
            System.out.println("Il numero minimo di giocatori per i giochi da tavolo è: 2.");

        if (durataInMin <= 0) System.out.println("Il numero inserito non è un valore valido.");

        this.numeroGiocatori = numeroGiocatori;
        this.durataInMin = durataInMin;
    }

    //METODI

    //GETTER
    public int getNumeroGiocatori() {

        return numeroGiocatori;

    }

    public int getDurataInMin() {

        return durataInMin;
    }


}
