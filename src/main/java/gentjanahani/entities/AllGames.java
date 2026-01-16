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

    public static void setCounter(long counter) {
        AllGames.counter = counter;
    }

    //GETTER
    public LocalDate getAnnoDiPubblicazione() {
        return annoDiPubblicazione;
    }

    public void setAnnoDiPubblicazione(LocalDate annoDiPubblicazione) {
        this.annoDiPubblicazione = annoDiPubblicazione;
    }

    public long getIDGame() {
        return idGame;
    }

    //SETTER

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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
