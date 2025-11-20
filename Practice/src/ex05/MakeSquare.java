
package ex05;

/**
 * The type Make square.
 */
public class MakeSquare {

    /**
     * Make square string.
     *
     * @param n the n
     * @return the string
     */
    public static String makeSquare(int n) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result.append('+');
                }
                if (i < n - 1){
                    result.append('\n');
                }
            }
            return result.toString();
    }
}
