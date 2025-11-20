package ex04;

public class    FirstNonRepeatingLetter {
    /**
     * Trova il primo carattere nella stringa che appare una sola volta.
     * Confronto case-insensitive, ma ritorna il carattere nel suo case originale.
     *
     * @param str La stringa di input
     * @return Una stringa contenente il primo carattere non ripetuto, o stringa vuota se non trovato
     */
    public static String firstNonRepeatingLetter(String str) {
        if (str == null || str.isEmpty()) return "";
        int[] charCount = new int[65536];
        for (char character : str.toCharArray()) {
            char lower = Character.toLowerCase(character);
            charCount[lower]++;
        }
        for (char character : str.toCharArray()) {
            char lower = Character.toLowerCase(character);
            if (charCount[lower] == 1) return String.valueOf(character);
        }
        return "";
    }
}
