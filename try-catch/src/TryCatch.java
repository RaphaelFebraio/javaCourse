import java.util.Scanner;

public class TryCatch {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      int idade = scanner.nextInt();
      System.out.println("Seu idade é: " + (idade));
    } catch (Exception e) {
      System.out.println("Erro: " + e);
    } finally {
        System.out.println("Fim.");
    }
  }
}
