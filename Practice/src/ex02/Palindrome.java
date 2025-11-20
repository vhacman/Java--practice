package ex02;

/**
 * Classe che fornisce metodi per verificare se una stringa è un palindromo.
 * <p>
 * Un palindromo è una parola, frase o sequenza che si legge allo stesso modo
 * sia da sinistra a destra che da destra a sinistra, ignorando spazi,
 * punteggiatura e maiuscole/minuscole.
 * <p>
 * Questa classe implementa due algoritmi diversi per la verifica:
 * uno basato su ciclo while e uno basato su ciclo for.
 *
 * @author Vhacman
 * @version 1.0
 */
public class    Palindrome {

    /**
     * Verifica se una stringa è un palindromo utilizzando un ciclo while.
     * <p>
     * Il metodo rimuove tutti i caratteri non alfanumerici, converte la stringa
     * in minuscolo e confronta i caratteri procedendo contemporaneamente dall'inizio
     * e dalla fine verso il centro usando un ciclo while.
     * <p>
     * Esempi:
     * <ul>
     *     <li>"A man, a plan, a canal: Panama" → true</li>
     *     <li>"race a car" → false</li>
     *     <li>"" → true (stringa vuota è considerata palindroma)</li>
     * </ul>
     *
     * @param palindrome la stringa da verificare
     * @return true se la stringa è un palindromo, false altrimenti
     */
    public static boolean   isPalindromeWhile(String palindrome) {
        String  cleanedString;
        int     left;
        int     right;

        if(palindrome == null) return (false);
        cleanedString = palindrome.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(cleanedString.isEmpty()) return (true);
        left = 0;
        right = cleanedString.length() - 1;
        while (left < right) {
            if(cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return (false);
            }
            left++;
            right--;
        }
        return(true);
    }

    /**
     * Verifica se una stringa è un palindromo utilizzando un ciclo for.
     * <p>
     * Il metodo rimuove tutti i caratteri non alfanumerici, converte la stringa
     * in minuscolo e confronta i caratteri procedendo dall'inizio verso il centro
     * usando un ciclo for.
     * <p>
     * Questo metodo è funzionalmente equivalente a {@link #isPalindromeWhile(String)},
     * ma utilizza una struttura di controllo diversa (ciclo for invece di while).
     * <p>
     * Esempi:
     * <ul>
     *     <li>"A man, a plan, a canal: Panama" → true</li>
     *     <li>"race a car" → false</li>
     *     <li>"" → true (stringa vuota è considerata palindroma)</li>
     * </ul>
     *
     * @param palindrome la stringa da verificare
     * @return true se la stringa è un palindromo, false altrimenti
     * @see #isPalindromeWhile(String)
     */
    public static boolean   isPalindromeFor(String palindrome) {
        String cleanedString;

        if (palindrome == null) return (false);
        cleanedString = palindrome.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (cleanedString.isEmpty()) return (true);
        for (int i = 0; i < cleanedString.length() / 2; i++) {
            int j = cleanedString.length() - 1 - i;
            if (cleanedString.charAt(i) != cleanedString.charAt(j)) return false;
        }
        return (true);
    }
}

