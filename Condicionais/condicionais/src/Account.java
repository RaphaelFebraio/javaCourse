public class Account {

    public String nome;
    public double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Sem valor suficiente.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }

    public Account(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }

}
