package Final;

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
    /**
     * Determine the type of animal based on its characteristics.
     * 
     * @param isWarmBlooded true if the animal is warm-blooded, false otherwise
     * @param laysEggs true if the animal lays eggs, false otherwise
     * @return a string representing the type of animal
     */
    public static String determineType(boolean isWarmBlooded, boolean laysEggs) {
        if (isWarmBlooded)
            _____ (laysEggs)
                return "monotreme";
        _____
            return "mammal";
        return _____;
    }

    public static void main(String[] args) {
        boolean isWarmBlooded = true;
        boolean laysEggs = false;

        String classification = determineType(isWarmBlooded, laysEggs);
        System.out.println("Classification: " + classification);

        if ("mammal".equals(classification)) {
            System.out.println("✔ Correct classification.");
        } else {
            System.err.println("✘ Incorrect classification: " + classification);
        }
    }
}