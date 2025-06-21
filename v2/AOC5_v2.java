package v2;

public class AOC5_v2 {
    public static void main(String[] args) {
        int userPerms = 6;
        int specialPerm = userPerms _____; 
        int combined = (userPerms & 5); 

        if (specialPerm == 2 && combined == 4) {
            System.out.println("✔ Correct atom reconstructed! specialPerm=" + specialPerm);
        } else {
            System.out.println("✘ Wrong or missing bitwise AND atom " +
                               "(specialPerm=" + specialPerm + ", combined=" + combined + ")");
        }
    }
}
