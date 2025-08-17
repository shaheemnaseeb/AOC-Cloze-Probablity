package Final;

/**
 * ScoreTracker tracks scores for multiple rounds.
 * It provides a method to process round scores and calculate the total.
 * 
 * AOC10 is used in this program
 */
public class ScoreTracker {
    /**
     * Track scores for each round and return the total.
     * @param roundScores array of scores for each round
     * @return the total score after all rounds
     */
    public static int trackScores(int[] roundScores) {
        int total = 0;
        System.out.println("Round  Score  Total");
        System.out.println("-------------------");
        for (int i = 0; i < roundScores.length; i++) {
            int points = roundScores[i];
            ______
            System.out.printf("%5d  %5d%n", points, total);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] rounds = { 10, 15, 20, 5, 12 };
        int finalTotal = trackScores(rounds);
        System.out.println("-------------------");
        System.out.println("Final total: " + finalTotal);
    }
}

