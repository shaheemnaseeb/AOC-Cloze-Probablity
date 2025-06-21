package AOC;

public class AOC3 {
  // This atom of confusion is called "Dangling Else".
  public static void main(String[] args) {
    boolean V1 = (2 != 3);
    boolean V2 = false;
    int R = 3;
    if (V1)
      if (V2)
        R = R + 2;
    else
      R = R + 4;
  }
}
