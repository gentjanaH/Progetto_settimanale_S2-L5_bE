package gentjanahani.entities;

import java.time.LocalDate;

public abstract class AllGames {

    private static long counter = 1;

    //ATTRIBUTI COMUNI
    private long idGame;
    private String title;
    private LocalDate annoDiPubblicazione;
    private Double price;

    //COSTRUTTORI
    public AllGames(String title, LocalDate annoDiPubblicazione, Double price) {
        this.idGame = counter++;
        this.title = title;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.price = price;
    }

    //METODI


    //GETTER
    public LocalDate getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public long getIDGame() {
        return idGame;
    }

    public Double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    //SETTER


    public void setIdGame(long idGame) {
        this.idGame = idGame;
    }

    @Override
    public String toString() {
        return "AllGames{" +
                "annoDiPubblicazione=" + annoDiPubblicazione +
                ", IDGame=" + idGame +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
