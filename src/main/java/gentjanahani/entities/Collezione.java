package gentjanahani.entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
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
        if (risultato.isEmpty()) System.out.println("Nessun gioco trovato sotto: " + price + " €");
        return risultato;
    }

    //Ricerca per numero di giocatori

    public List<BoardGames> cercaPerNumeroGiocatori(int giocatori) {
        List<BoardGames> risultato = giochi.stream()
                .filter(g -> g instanceof BoardGames)
                .map(g -> (BoardGames) g)
                .filter(bg -> bg.getNumeroGiocatori() == giocatori)
                .toList();
        if (risultato.isEmpty()) System.out.println("Nessun gioco trovato");
        return risultato;
    }

    //Rimuovere un elemento dato l'ID
    public boolean rimuoviConId(long id) {
        return giochi.removeIf(g -> g.getIDGame() == id);

    }

    //Aggiornare un elemento dato l'ID
    public boolean aggiornaConId(long id, AllGames nuovoGioco) {
        for (int i = 0; i > giochi.size(); i++) {
            if (giochi.get(i).getIDGame() == id) {
                nuovoGioco.setIdGame(id);

                giochi.set(i, nuovoGioco);
                return true;
            }
        }
        return false;
    }

    //Statistiche della collezione: numero tot di giochi da tavolo e videogiochi,
    //gioco con prezzo più alto, media dei prezzi.
    public void statistiche() {
        long totBoardGames = giochi.stream()
                .filter(g -> g instanceof BoardGames)
                .count();

        long totVideoGames = giochi.stream()
                .filter(g -> g instanceof VideoGames)
                .count();

        AllGames giocoPiùCostoso = giochi.stream()
                .max(Comparator.comparing(AllGames::getPrice))
                .orElse(null);
        if (giocoPiùCostoso != null) System.out.println("Il gioco più costoso è: " + giocoPiùCostoso.getTitle());

        DoubleSummaryStatistics stats = giochi.stream()
                .mapToDouble(AllGames::getPrice)
                .summaryStatistics();

        System.out.println("----STATISTICHE COLLEZIONE----");
        System.out.println("Totale giochi da tavolo: " + totBoardGames);
        System.out.println("Totale video giochi: " + totVideoGames);
        System.out.println("Prezzo medio: " + stats.getAverage());
        System.out.println("Prezzo massimo: " + stats.getMax());
        System.out.println("Prezzo minimo: " + stats.getMin());
        System.out.println("Gioco più costoso: " + giocoPiùCostoso);
    }

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
