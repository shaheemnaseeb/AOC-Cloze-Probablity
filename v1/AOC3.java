package v1;

public class AOC3 {
    public static void main(String[] args) {
        boolean V1 = (2 != 3);
        boolean V2 = false;
        int R = 3;
        
	if (V1)
            if (V2)
                R = R + 2;
	      _____
           R = R + 4;

        if (R == 7 && V1) {
      	    System.out.println("Correct atom reconstructed!");
        } else {
            System.out.println("Wrong, you didn’t input correctly");
        }
    }
}
