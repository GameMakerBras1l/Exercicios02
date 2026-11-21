package Ex03;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        // Testando idade inválida
        pessoa.setIdade(-5);

        // Testando idade válida
        pessoa.setIdade(20);

        System.out.println("Idade: " + pessoa.getIdade());
    }
}
