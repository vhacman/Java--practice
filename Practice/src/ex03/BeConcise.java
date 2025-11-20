
package ex03;

/**
 * The type Be concise.
 * Exercise useful to practice ternary operators
 */
public class BeConcise {
    /**
     * Describe age string.
     *
     * @param age the age inserted
     * @return the string
     */
    static String describeAge(int age) {
        return "You're a(n) " + (age < 13 ? "kid" : age < 18 ? "teenager" : age < 65 ? "adult" : "elderly");
    }
}
