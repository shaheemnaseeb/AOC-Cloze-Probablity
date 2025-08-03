package Final;

/**
 * SensorDataProcessor processes sensor data readings.
 * It checks if readings are valid and computes the average of valid readings.
 * 
 * AOC8 is used in this program
 */
public class SensorDataProcessor {
    private static ______ int ERROR_CODE = 999;

    public static boolean isValidReading(int reading) {
        return ______;
    }

    public static double ______(int[] readings) {
        int sum = 0, count = 0;
        for (int reading : ______) {
            if (isValidReading(reading)) {
                sum += reading;
                ______ += 1;
            }
        }
        if (count > 0) {
            return ______ / count;
        } else {
            System.err.println("Error: No valid readings found!");
            ______ 0.0; // Return 0.0 if no valid readings
        }
    }

    public static void main(String[] args) {
        int[] readings = { 23, 999, 45, 67, 999, 34, 88 };

        double ______ = computeAverage(readings);
        System.out.printf("Average of valid readings: %.2f%n", avg);

        System.out.println("Valid readings:");
        for (int reading : readings) {
            if (______(reading)) {
                System.out.println("  " + reading);
            }
        }
    }
}
