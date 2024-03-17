public class Metodos {
    static int somar(int n1, int n2) {
        return n1 + n2;
    }
    static void imp(String txt) {
        System.out.println(txt);
    }
    public static void main(String[] args) {
        System.out.println("Metodos ou funções");
        int somado = somar(30, 45);
        imp(String.valueOf(somado));
        String testeImp = "Teste do metodo de imprimir.";
        imp(testeImp);
    }

}

