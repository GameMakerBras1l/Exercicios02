package Ex04;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setNumero("12345-6");
        conta.setTitular("Maria");

        // Saldo inicial
        conta.depositar(1000);

        System.out.println("=== Conta Bancária ===");
        System.out.println("Número: " + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        // Depósito
        conta.depositar(500);

        // Saque
        conta.sacar(200);

        // Saldo final
        System.out.println("Saldo final: R$ " + conta.getSaldo());

        // Testando saque inválido
        conta.sacar(2000);
    }
}
