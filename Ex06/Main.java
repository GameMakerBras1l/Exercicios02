package Ex06;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
            "João",
            "Programador",
            2000
        );

        System.out.println("=== Funcionário ===");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário inicial: R$ " + funcionario.getSalario());

        // Aumento de 10%
        funcionario.aumentarSalario(10);

        System.out.println("Novo salário: R$ " + funcionario.getSalario());

        // Testando aumento inválido
        funcionario.aumentarSalario(-5);

        // Testando nome inválido
        funcionario.setNome("");

        System.out.println("\n=== Dados finais ===");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: R$ " + funcionario.getSalario());
    }
}
