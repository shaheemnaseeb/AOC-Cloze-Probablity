package v2;

import java.util.Scanner;

public class AOC3_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Do you like coffee? (true/false): ");
        boolean likesCoffee = sc.nextBoolean();
        System.out.print("Do you like tea?    (true/false): ");
        boolean likesTea = sc.nextBoolean();

        int R = 3;
        if (likesCoffee)
            if (likesTea)
                R = R + 2;
        _____ 
            R = R + 4;

        System.out.print("Do you like sugar? (true/false): ");
        boolean likesSugar = sc.nextBoolean();

        if (R == 7 && likesSugar) {
            R++;
        }

        if ((likesCoffee && !likesTea && R >= 7) || (likesCoffee && likesTea && R == 5)) {
            System.out.println("✔ Correct atom reconstructed! R=" + R);
        } else {
            System.out.println("✘ Wrong or missing dangling‐else atom (R=" + R + ")");
        }

        sc.close();
    }
}
