package ex02;

/**
 * Classe principale che testa i metodi di verifica dei palindromi.
 * <p>
 * Questa classe fornisce un'interfaccia a riga di comando per testare
 * i due algoritmi di verifica dei palindromi implementati nella classe {@link Palindrome}.
 *
 * @author Vhacman
 * @version 1.0
 * @see Palindrome
 */
public class Main {
    /**
     * Metodo principale dell'applicazione.
     * <p>
     * Accetta due argomenti da riga di comando:
     * <ul>
     *     <li>args[0]: "1" per usare il metodo while, qualsiasi altro valore per usare il metodo for</li>
     *     <li>args[1]: la stringa da verificare come palindromo</li>
     * </ul>
     * <p>
     * Gestisce eventuali eccezioni sollevate dai metodi di verifica e stampa
     * messaggi di errore appropriati.
     *
     * @param args argomenti della riga di comando: [algoritmo, stringa_da_verificare]
     */
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Please enter a valid string");
            return ;
        }
        if(args[0].equals("1")) {
            try {
                boolean result = Palindrome.isPalindromeWhile(args[1]);
                System.out.println("Is a palindrome: " + result);
            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        else {
            try {
                boolean result = Palindrome.isPalindromeFor(args[1]);
                System.out.println("Is a palindrome: " + result);
            }
            catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}