
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


public class Kata {
    public static String rps(String p1, String p2) {
        if(p1.equals(p2))
            return ("Draw!");
        if ((p1.equals("rock") && p2.equals("scissors")) ||
                (p1.equals("scissors") && p2.equals("paper")) ||
                (p1.equals("paper") && p2.equals("rock")))  // ← Tolto una )
            return ("Player 1 won!");
        return ("Player 2 won!");
    }

    public static void main(String[] args) {
        String result = rps("scissors", "rock");
        System.out.println(result);
        System.out.println(rps("rock", "scissors"));    // Player 1 won!
        System.out.println(rps("paper", "paper"));      // Draw!
        System.out.println(rps("rock", "paper"));       // Player 2 won!
    }
}