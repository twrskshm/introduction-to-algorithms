import java.util.Set;
import java.util.HashSet;

public class Factorization {
    // Time complexity: O(n)
    // Space complexity: O(k)
    private static Set<Integer> trialDivision(int number) {
        Set<Integer> factors = new HashSet<>();

        for (int divisor = 1; divisor <= number; divisor++) {
            if (number % divisor == 0) {
                factors.add(divisor);
            }
        }

        return factors;
    }

    // Time complexity: O(sqrt(n))
    // Space complexity: O(k)
    private static Set<Integer> optimizedTrialDivision(int number) {
        Set<Integer> factors = new HashSet<>();
        int divisorLimit = (int) Math.sqrt(number);

        for (int divisor = 1; divisor <= divisorLimit; divisor++) {
            if (number % divisor == 0) {
                int complementaryDivisor = number / divisor;

                factors.add(divisor);
                factors.add(complementaryDivisor);
            }
        }

        return factors;
    }
}
