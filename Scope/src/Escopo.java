
public class Escopo {
    String Highest  = "variavel em escopo maior da classe.";
    public static void main(String[] args) {
        String higher = "variavel dentro do metodo main," +
                " Não acessível fora dela.";
                if(true == true) {
                    String varDentroIf = "Só acessível dentro do if";
                }
    }
}
