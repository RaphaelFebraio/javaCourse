import java.util.Scanner;

public class ConsultaCep {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String cep = scanner.next();
    try {
      FormatarCep(cep);
    } catch (CepErradoException e) {
      System.out.println(e);
    }
  }

  static String FormatarCep(String cep) throws CepErradoException {
    if (cep.length() != 8) {
      throw new CepErradoException("Cep Inválido");
    } else {
      return cep;
    }
  }
}
