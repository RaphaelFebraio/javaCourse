public class App {
    public static void main(String[] args) {
        String str = "Teste";

        switch (str) {
            case "Teste":
                do {
                    for (int i = 1; i <= 5; i++) {
                        if (i == 3) {
                            System.out.println("i é igual a 3.");
                        } else {
                            System.out.println(str + " " + i);
                        }
                    }
                } while (str == "Teste1");
                break;
            default:
                break;
        }

    }
}
