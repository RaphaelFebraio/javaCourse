public class ExemploForArray {

  public static void main(String[] args) {
    String moradores[] = { "Raphael", "Natacha", "Dexter", "Luffy" };

    for (int i = 0; i < moradores.length; i++) {
      System.out.println(
        "Morador da casa nº " + (i + 1) + ", Nome: " + moradores[i]
      );
    }

    for (String morador : moradores) {
      System.out.println("Nome: " + morador);
    }
  }
}
