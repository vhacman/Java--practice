package ex06;

/**
 * The type Sum array.
 */
public class SumArray {
    /**
     * Sum double.
     *
     * @param numbers the numbers
     * @return the double
     */
    public static double sum (double[] numbers) {
        double result = 0;

        for (double number : numbers) {
            result += number;
        }
        return result;
    }
}
