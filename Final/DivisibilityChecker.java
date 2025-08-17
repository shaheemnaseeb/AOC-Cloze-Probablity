package Final;

/**
 * DivisibilityChecker checks if a number is not a multiple of 5.
 * It provides a method to check divisibility and a main method to demonstrate
 * its functionality.
 * 
 * AOC9 is used in this program
 */
public class DivisibilityChecker {

    /**
     * Check if a number is not a multiple of 5.
     * @param element the integer to check
     * @return true if the number is not a multiple of 5, false otherwise
     */
    public static boolean isNotMultipleOf5(int element) {
        return ______;
    }

    public static void main(String[] args) {
        int[] values = { 3, 5, 7, 10, 12, 15, 18, 20, 22, 25 };

        System.out.println("Numbers not divisible by 5:");
        for (int value : values) {
            if (isNotMultipleOf5(value)) {
                System.out.println("  " + value);
            }
        }
    }
}
