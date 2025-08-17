package Final;

/**
 * SensorDataProcessor processes sensor data readings.
 * It checks if readings are valid and computes the average of valid readings.
 * 
 * AOC8 is used in this program
 */
public class SensorDataProcessor {
    private static final int ERROR_CODE = 999;

    /**
     * Check if a sensor reading is valid.
     * A valid reading is not equal to the error code.
     * @param reading the sensor reading to check
     * @return true if the reading is valid, false otherwise
     */
    public static boolean isValidReading(int reading) {
        return ______;
    }

    /**
     * Compute the average of valid sensor readings.
     * @param readings array of sensor readings
     * @return the average of valid readings, or 0.0 if no valid readings are found
     */
    public static double computeAverage(int[] readings) {
        int sum = 0, count = 0;
        for (int reading : readings) {
            if (isValidReading(reading)) {
                sum += reading;
                count += 1;
            }
        }
        if (count > 0) {
            return (double) sum / count;
        } else {
            System.err.println("Error: No valid readings found!");
            return 0.0; // Return 0.0 if no valid readings
        }
    }

    public static void main(String[] args) {
        int[] readings = { 23, 999, 45, 67, 999, 34, 88 };

        double avg = computeAverage(readings);
        System.out.printf("Average of valid readings: %.2f%n", avg);

        System.out.println("Valid readings:");
        for (int reading : readings) {
            if (isValidReading(reading)) {
                System.out.println("  " + reading);
            }
        }
    }
}
