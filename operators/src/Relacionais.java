public class Relacionais {

    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "b";

        if(str1 != str2) {
            System.out.println("Diferente");
        } else {
            System.out.println("Igual");
        }

        int n1 = 1;
        int n2 = 2;

        String ver = (n1 <= n2) ?
                "Verificação 1" :
                "Verificação 2";

        System.out.println(ver);
    }
}
