package AOC;

public class AOC6 {
  // This atom of confusion is called Comma Operator.
  public static void main(String[] args) {
    int sum = 5;
    int V1 = 5;
    for (int i = 0, j = 10; i < j; i++, sum += i) {
      V1 += i;
    }
    System.out.println("Sum: " + sum);
    System.out.println("V1: " + V1);
  }
}
