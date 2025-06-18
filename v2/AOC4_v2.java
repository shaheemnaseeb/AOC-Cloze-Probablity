package v2;

public class AOC4_v2 {
    public static void main(String[] args) {
        boolean loggingEnabled = true;
        boolean debugEnabled = false;
        boolean telemetry = true;

        boolean featureOk = _____; // Use loggingEnabled, debugEnabled, telemetry exactly once, with || and &&

        boolean featureWrong = (loggingEnabled || debugEnabled) && telemetry;

        if (featureOk && !featureWrong) {
            System.out.println("✔ Correct precedence atom reconstructed!");
        } else {
            System.out.println("✘ Wrong or missing boolean precedence atom");
            System.out.println("   featureOk=" + featureOk + ", featureWrong=" + featureWrong);
        }
    }
}
