package v4;

/**
 * AnimalTypeApp classifies an animal:
 *
 *  - If warm-blooded
 *       • and lays eggs → "monotreme"
 *       • otherwise    → "mammal"
 *  - Else → "reptile"
 * 
 * AOC3 is used in this program
 */
public class AnimalType {
    public static String determineType(boolean _____, boolean laysEggs) {
        if (isWarmBlooded)
            _____ (laysEggs)
                return "monotreme";
        _____
            return "mammal";
        return _____;
    }

    public static void main(String[] args) {
        boolean isWarmBlooded = true;
        boolean _____     = false;

        String classification = _____(isWarmBlooded, laysEggs);
        System.out.println("Classification: " + classification);

        if ("mammal".equals(_____)) {
            System.out.println("✔ Correct classification.");
        } else {
            System.err.println("✘ Incorrect classification: " + classification);
        }
    }
}