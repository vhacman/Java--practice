package ex03;

/**
 * Classe principale per l'applicazione di descrizione dell'età.
 * Questo programma prende un'età come argomento da riga di comando e restituisce
 * una descrizione della categoria di età (bambino, adolescente, adulto o anziano).
 */
public class Main {
    /**
     * Punto di ingresso dell'applicazione.
     * <p>
     * Questo metodo elabora gli argomenti da riga di comando per determinare la categoria di età.
     * Valida l'input per assicurarsi che sia un numero intero positivo prima di chiamare
     * il metodo describeAge.
     * </p>
     * <p>
     * Input atteso: Un singolo numero intero positivo che rappresenta un'età.
     * </p>
     * <p>
     * Gestione degli errori:
     * <ul>
     *   <li>Se non vengono forniti argomenti, richiede un'età valida</li>
     *   <li>Se l'età è negativa, richiede un'età valida</li>
     *   <li>Se l'input non è un numero intero valido, richiede un'età valida</li>
     * </ul>
     * </p>
     *
     * @param args gli argomenti da riga di comando dove args[0] dovrebbe contenere l'età
     *             come rappresentazione stringa di un numero intero positivo
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a valid age");
            return;
        }
        try {
            int age = Integer.parseInt(args[0]);
            if (age < 0) {
                System.out.println("Please enter a valid age");
                return;
            }
            System.out.println(BeConcise.describeAge(age));
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid age");
        }
    }
}