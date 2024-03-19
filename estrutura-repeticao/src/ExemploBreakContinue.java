public class ExemploBreakContinue {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("Interação " + i);
      if (i == 3) break;
    }
    System.out.println(
      "---------------------------------------------------------------------------------------------------------------------------------"
    );

    for (int j = 0; j < 7; j++) {
      System.out.println("Interação " + j);
      continue;
    }
  }
}
