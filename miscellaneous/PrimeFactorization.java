import java.util.List;
import java.util.LinkedList;

public class PrimeFactorization {
    // Time complexity: O(n)
    // Space complexity: O(lg(n))
    private static List<Integer> trialDivision(int number) {
        List<Integer> primeFactors = new LinkedList<>();

        for (int divisor = 2; divisor <= number; divisor++) {
            while (number % divisor == 0) {
                primeFactors.add(divisor);
                number /= divisor;
            }
        }

        return primeFactors;
    }

    // Time complexity: O(sqrt(n))
    // Space complexity: O(lg(n))
    private static List<Integer> optimizedTrialDivision(int number) {
        List<Integer> primeFactors = new LinkedList<>();
        int divisorLimit = (int) Math.sqrt(number);

        for (int divisor = 2; divisor <= divisorLimit; divisor++) {
            while (number % divisor == 0) {
                primeFactors.add(divisor);
                number /= divisor;
            }

            if (number == 1) {
                break;
            }
        }

        if (number > 1) {
            primeFactors.add(number);
        }

        return primeFactors;
    }
}
