package v2;

public class AOC2_v2 {
    public static void main(String[] args) {
        int lives = _____;
        int score = 0;

        while (lives > 0)
            lives--;                       
            _____;

        if (score >= 5) {
            score = score * 2;
        }


        if (lives == 0 && score == 1) {
            System.out.println("✔ Correct atom reconstructed! Final score=" + score);
        } else {
            System.out.println("✘ Wrong or missing atom (lives=" + lives +
                               ", score=" + score + ")");
        }
    }
}
