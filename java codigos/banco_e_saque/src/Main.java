public class Main {
    public static void main(String[] args) {
        // Cria uma nova conta bancária
        ContaBancaria conta = new ContaBancaria();

        // Realiza um depósito e um saque
        conta.depositar(1000);
        System.out.println("Saldo: R$" + conta.getSaldo());
        conta.sacar(500);
        System.out.println("Saldo: R$" + conta.getSaldo());
        conta.sacar(700);
        System.out.println("Saldo: R$" + conta.getSaldo());
    }
}