package gentjanahani.entities;

import java.util.ArrayList;
import java.util.List;

public class Collezione {
    //ATTRIBUTI
    private List<AllGames> giochi;

    //COSTRUTTORI
    public Collezione() {
        this.giochi = new ArrayList<>();

    }

    //METODI
    //metodo che permetta  di aggiungere un elemento controllando l'id
    public void aggiungiGioco(AllGames gioco) {

        boolean esiste = giochi.stream().anyMatch(g -> g.getIDGame() == gioco.getIDGame());

        if (esiste) {
            System.out.println("Errore: un gioco con lo stesso ID è gia presente: " + gioco.getIDGame() + gioco.getTitle());
        } else {
            giochi.add(gioco);
            System.out.println("Gioco aggiunto: " + gioco.getTitle());
        }

    }

    //ricerca per ID
    public AllGames cercaPerId(long id) {
        return giochi.stream()
                .filter(g -> g.getIDGame() == id)
                .findFirst()
                .orElse(null);


    }

    //Ricerca per prezzo, lista di giochi con prezzo inferiore a quello inserito
    public List<AllGames> cercaPerPrezzo(double price) {
        List<AllGames> risultato = giochi.stream()
                .filter(g -> g.getPrice() <= price)
                .toList();
        if (risultato.isEmpty()) System.out.println("Nessun gioco trovato sotto " + price + " €");
        return risultato;
    }

    //Ricerca per numero di giocatori

    public List<AllGames> cercaPerNumeroGiocatori(int giocatori) {
        List<AllGames> risultato = giochi.stream()
                .
    }
    //Rimuovere un elemento dato l'ID
    //Aggiornare un elemento dato l'ID
    //Statistiche della collezione: numero tot di giochi da tavolo e videogiochi,
    //gioco con prezzo più alto, media dei prezzi.

    public List<AllGames> getGiochi() {
        return giochi;
    }

    @Override
    public String toString() {
        return "Collezione{" +
                "giochi=" + giochi +
                '}';
    }
}
