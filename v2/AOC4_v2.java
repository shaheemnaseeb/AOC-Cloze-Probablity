package v2;

import java.util.Scanner;

public class AOC4_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enable logging?     (true/false): ");
        boolean loggingEnabled = sc.nextBoolean();
        System.out.print("Enable debugging?   (true/false): ");
        boolean debugEnabled = sc.nextBoolean();
        System.out.print("Enable telemetry?   (true/false): ");
        boolean telemetry = sc.nextBoolean();

        boolean featureOk = (_____);

        boolean featureWrong = (loggingEnabled || debugEnabled) && telemetry;

        if (featureOk && !featureWrong) {
            System.out.println("✔ Correct precedence atom reconstructed!");
        } else {
            System.out.println("✘ Wrong or missing boolean precedence atom");
            System.out.println("   featureOk=" + featureOk + ", featureWrong=" + featureWrong);
        }
        sc.close();
    }
}
