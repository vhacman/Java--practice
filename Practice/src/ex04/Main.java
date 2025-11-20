package ex04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test 1: \"stress\" -> \"" + FirstNonRepeatingLetter.firstNonRepeatingLetter("stress") + "\" (atteso 't')");
        System.out.println("Test 2: \"sTreSS\" -> \"" + FirstNonRepeatingLetter.firstNonRepeatingLetter("sTreSS") + "\" (atteso 'T')");
        System.out.println("Test 3: \"aabbcc\" -> \"" + FirstNonRepeatingLetter.firstNonRepeatingLetter("aabbcc") + "\" (atteso '')");
        System.out.println("Test 4: \"hello\" -> \"" + FirstNonRepeatingLetter.firstNonRepeatingLetter("hello") + "\" (atteso 'h')");
        System.out.println("Test 5: \"\" -> \"" + FirstNonRepeatingLetter.firstNonRepeatingLetter("") + "\" (atteso '')");
        System.out.println("Test 6: \"a\" -> \"" + FirstNonRepeatingLetter.firstNonRepeatingLetter("a") + "\" (atteso 'a')");
        System.out.println("Test 7: \"abab\" -> \"" + FirstNonRepeatingLetter.firstNonRepeatingLetter("abab") + "\" (atteso '')");
        System.out.println("Test 8: \"the quick brown fox\" -> \"" + FirstNonRepeatingLetter.firstNonRepeatingLetter("the quick brown fox") + "\" (atteso 't')");
    }
}