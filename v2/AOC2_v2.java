package v2;
import java.util.Scanner;

public class AOC2_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting lives (integer > 0): ");
        int lives = sc.nextInt();
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
        sc.close();
    }
}
