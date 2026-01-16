package gentjanahani;

import gentjanahani.entities.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Collezione collezione = new Collezione();

        BoardGames carteUno = new BoardGames("Uno", LocalDate.of(2002, 2, 10), 5.99, 10, 20);
        BoardGames monopoly = new BoardGames("Monopoly", LocalDate.of(1963, 3, 10), 35.5, 8, 90);
        BoardGames ilGiocoDellOca = new BoardGames("Il gioco dell'oca", LocalDate.of(1993, 10, 18), 10.99, 5, 30);
        VideoGames finalFantasy = new VideoGames("Final Fantasy", LocalDate.of(2005, 12, 06), 26.7, Piattaforma.PC, Genere.RolePLaying);
        VideoGames fifa = new VideoGames("Fifa", LocalDate.of(2001, 07, 06), 40.7, Piattaforma.PS5, Genere.FOOTBALL);
        VideoGames theLastOfUs = new VideoGames("The Last Of Us", LocalDate.of(2005, 12, 06), 23.7, Piattaforma.XBOX, Genere.ACTION);
        VideoGames superMario = new VideoGames("Super Mario", LocalDate.of(1997, 12, 06), 26.7, Piattaforma.NINTENDO, Genere.ALTRO);

        collezione.aggiungiGioco(carteUno);
        collezione.aggiungiGioco(monopoly);
        collezione.aggiungiGioco(ilGiocoDellOca);
        collezione.aggiungiGioco(finalFantasy);
        collezione.aggiungiGioco(fifa);
        collezione.aggiungiGioco(theLastOfUs);
        collezione.aggiungiGioco(superMario);

        System.out.println("Collezione di giochi:  " + collezione);


        //ricerca dei giochi con id
        System.out.println("cerca un gioco tramite ID.");
        Long numId = Long.valueOf(scanner.nextLine());
        AllGames ricercaConId = collezione.cercaPerId(numId);
        System.out.println("Risultato: " + ricercaConId);

        //ricerca dei giochi per prezzo
        System.out.println("Filtra per prezzo");
        Double inputPrezzo = scanner.nextDouble();
        List<AllGames> risulatiPerPrezzo = collezione.cercaPerPrezzo(inputPrezzo);
        System.out.println(risulatiPerPrezzo.size() + " " + "Risultati: " + risulatiPerPrezzo);

        //ricerca per numero giocatori
        System.out.println("Filtra la ricerca per numero giocatori. Inserisci un numero da 2 a 10.");
        int inputGiocatori = scanner.nextInt();
        List<BoardGames> risultatiPerGiocatori = collezione.cercaPerNumeroGiocatori(inputGiocatori);
        System.out.println(risultatiPerGiocatori.size() + " " + "Risultati: " + risultatiPerGiocatori);

        //elimina un gioco
        System.out.println("Inserisci l'ID del gioco da eliminare.");
        int inputElimina = scanner.nextInt();
        boolean elimina = collezione.rimuoviConId(inputElimina);
        if (elimina) System.out.println("Gioco rimosso con successo.");
        else System.out.println("Non ho trovato nessun gioco con questo Id.");


    }
}
