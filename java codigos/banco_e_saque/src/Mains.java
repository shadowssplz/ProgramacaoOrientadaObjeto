public class Mains {
    public static void main(String[] args) {
        // Criando uma conta bancária com saldo inicial de R$ 1000,00
        ContaBancaria minhaConta = new ContaBancaria(1000);
        
        // Imprimindo o saldo atual da conta
        System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
        
        // Realizando um depósito de R$ 500,00 na conta
        minhaConta.depositar(500);
        
        // Imprimindo o saldo atual da conta após o depósito
        System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
        
        // Realizando um saque de R$ 2000,00 na conta (valor acima do saldo)
        minhaConta.sacar(2000);
        
        // Imprimindo o saldo atual da conta após o saque
        System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
        
        // Realizando um saque de R$ 500,00 na conta (valor dentro do saldo)
        minhaConta.sacar(500);
        
        // Imprimindo o saldo atual da conta após o saque
        System.out.println("Saldo atual: R$" + minhaConta.getSaldo());
    }
}
