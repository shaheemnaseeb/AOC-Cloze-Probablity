package v2;

public class AOC3_v2 {
    public static void main(String[] args) {
        boolean likesCoffee = true;
        boolean likesTea = ______;

        int cup = 3;
        if (likesCoffee)
            if (likesTea)
                cup = cup + 2;
                ______; // avoid filling this blank to achieve the result
        else 
           _____;

        boolean likesSugar = true;

        if (cup == 7 && likesSugar) {
            cup++;
        }

        if (likesCoffee && !likesTea && R >= 7) {
            System.out.println("✔ Correct atom reconstructed! cup=" + cup);
        } else {
            System.out.println("✘ Wrong or missing dangling‐else atom (cup=" + cup + ")");
        }
    }
}
