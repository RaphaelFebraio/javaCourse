import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Account acc = new Account("Raphael");
        /*
         * acc.mostrarSaldo();
         * acc.depositar(1000.50);
         * acc.mostrarSaldo();
         * acc.sacar(900.75);
         * acc.mostrarSaldo();
         * acc.sacar(200);
         */
        
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println(
                    "Digite 1 para mostrar o saldo.\n" +
                            "Digite 2 para depositar na conta.\n" +
                            "Digite 3 para sacar da conta.\n" +
                            "Digite 4 para sair\n");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    acc.mostrarSaldo();
                    break;
                case 2:
                    acc.depositar(scanner.nextDouble());
                    break;
                case 3:
                    acc.sacar(scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Finalizando operação.");
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        } while (opcao != 4);

    }

}
