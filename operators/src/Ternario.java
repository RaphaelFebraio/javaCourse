public class Ternario {
    public static void main(String[] args) {
        int a;
        int b;

        a = 5;
        b = 6;

        if(a > b) {
            System.out.println("a maior que b!");
        } else {
            System.out.println("b maior que a");
        }

        String verificacao = (a > b) ?
                ("a maior que b!") :
                ("b maior que a");

        System.out.println(verificacao);
    }
}
