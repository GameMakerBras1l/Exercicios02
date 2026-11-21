package Ex01;
public class Main {
    public static void main(String[] args) {

        // Primeira pessoa
        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Carlos");
        pessoa1.setEmail("carlos@gmail.com");
        pessoa1.setTelefone("81999999999");
        pessoa1.setProfissao("Programador");

        // Segunda pessoa
        Pessoa pessoa2 = new Pessoa();

        pessoa2.setNome("Maria");
        pessoa2.setEmail("maria@gmail.com");
        pessoa2.setTelefone("81988888888");
        pessoa2.setProfissao("Professora");

        // Exibindo a primeira pessoa
        System.out.println("=== Pessoa 1 ===");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Email: " + pessoa1.getEmail());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        System.out.println("Profissão: " + pessoa1.getProfissao());

        // Exibindo a segunda pessoa
        System.out.println("\n=== Pessoa 2 ===");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Email: " + pessoa2.getEmail());
        System.out.println("Telefone: " + pessoa2.getTelefone());
        System.out.println("Profissão: " + pessoa2.getProfissao());
    }
}
