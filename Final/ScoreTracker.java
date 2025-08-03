package Final;

/**
 * ScoreTracker tracks scores for multiple rounds.
 * It provides a method to process round scores and calculate the total.
 * 
 * AOC10 is used in this program
 */
public class ScoreTracker {
    public static int trackScores(int[] ______) {
        int ______ = 0;
        System.out.println("Round  Score  Total");
        System.out.println("-------------------");
        for (int i = 0; i < roundScores.______; i++) {
            int points = roundScores[i];
            ______
            System.out.printf("%5d  %5d%n", points, total);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] rounds = { 10, 15, 20, 5, 12 };
        int ______ = trackScores(rounds);
        System.out.println("-------------------");
        System.out.println("Final total: " + ______);
    }
}

