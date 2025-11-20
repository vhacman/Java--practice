package ex00;
//Rules of the "Rock, Paper, Scissors" game are:
//
//Rock beats Scissors,
//Scissors beat Paper,
//Paper beats Rock,
//Two identical moves are a draw.
//Let's play! You will be given valid moves of two Rock,
// Paper, Scissors players, and have to return which player won:
// "Player 1 won!" for player 1, and "Player 2 won!" for player 2.
// In case of a draw return Draw!.

/**
 * Classe che implementa il gioco "Sasso, Carta, Forbici".
 * <p>
 * Regole del gioco:
 * <ul>
 *     <li>Il Sasso batte le Forbici</li>
 *     <li>Le Forbici battono la Carta</li>
 *     <li>La Carta batte il Sasso</li>
 *     <li>Due mosse identiche risultano in un pareggio</li>
 * </ul>
 *
 * @author Vhacman
 * @version 1.0
 */
public class Kata {
    /**
     * Determina il vincitore di una partita di Sasso, Carta, Forbici.
     * <p>
     * Questo metodo confronta le mosse di due giocatori e determina chi ha vinto
     * secondo le regole classiche del gioco.
     *
     * @param p1 la mossa del giocatore 1 ("rock", "paper", o "scissors")
     * @param p2 la mossa del giocatore 2 ("rock", "paper", o "scissors")
     * @return una stringa che indica il risultato: "Player 1 won!", "Player 2 won!", o "Draw!"
     */
    public static String rps(String p1, String p2) {
        if(p1.equals(p2))
            return ("Draw!");
        if ((p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock")))  // ← Tolto una )
            return ("Player 1 won!");
        return ("Player 2 won!");
    }

    /**
     * Metodo principale che testa la funzionalità del gioco.
     * <p>
     * Esegue alcuni test di esempio per dimostrare il funzionamento del metodo rps.
     *
     * @param args argomenti della riga di comando (non utilizzati)
     */
    public static void main(String[] args) {
        String result = rps("scissors", "rock");
        System.out.println(result);
        System.out.println(rps("rock", "scissors"));    // Player 1 won!
        System.out.println(rps("paper", "paper"));      // Draw!
        System.out.println(rps("rock", "paper"));       // Player 2 won!
    }
}