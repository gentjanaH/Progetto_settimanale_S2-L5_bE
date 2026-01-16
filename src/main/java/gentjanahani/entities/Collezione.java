package gentjanahani.entities;

import java.util.ArrayList;
import java.util.List;

public class Collezione {
    private List<AllGames> giochi;

    public Collezione() {
        this.giochi = new ArrayList<>();

    }

    public void aggiungiGioco(AllGames gioco) {

        boolean esiste = giochi.stream().anyMatch(g -> g.getIDGame() == gioco.getIDGame());

        if (esiste) {
            System.out.println("Errore: un gioco con lo stesso ID è gia presente: " + gioco.getIDGame() + gioco.getTitle());
        } else {
            giochi.add(gioco);
            System.out.println("Gioco aggiunto: " + gioco.getTitle());
        }

    }

    public List<AllGames> getGiochi() {
        return giochi;
    }
}
