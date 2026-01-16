package gentjanahani.entities;

import java.time.LocalDate;

public abstract class AllGames {
    //ATTRIBUTI COMUNI
    private long idGame;
    private String title;
    private LocalDate annoDiPubblicazione;
    private Double price;

    //COSTRUTTORI
    public AllGames(long idGame, String title, LocalDate annoDiPubblicazione, Double price) {
        this.idGame = idGame;
        this.title = title;
        this.annoDiPubblicazione = annoDiPubblicazione;
        this.price = price;
    }


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

    @Override
    public String toString() {
        return "AllGames{" +
                "annoDiPubblicazione=" + annoDiPubblicazione +
                ", IDGame=" + IDGame +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
