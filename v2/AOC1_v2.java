package v2;

public class AOC1_v2 {
    public static void main(String[] args) {
        int level = 2;
        int baseCharge = 10;
        int interim = level * 3;

        int tax = (level > 0) ? 2 * level : 0;
        int interest = _______;
        interest += tax;

        if (interest == 6 && level == 3) {
            System.out.println("✔ Correct atom reconstructed!");
        } else {
            System.out.println("✘ Wrong or missing pre‐increment atom (R=" + R +
                    ", level=" + level + ")");
        }
    }
}
