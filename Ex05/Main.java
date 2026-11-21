package Ex05;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();

        produto.setNome("Teclado");
        produto.setPreco(100);
        produto.setQuantidade(3);

        System.out.println("=== Cadastro de Produto ===");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Total: R$ " + produto.calcularTotal());

        // Testando valores inválidos
        produto.setPreco(-50);
        produto.setQuantidade(-2);

        // Verificando se os valores foram preservados
        System.out.println("\n=== Após as tentativas inválidas ===");
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Total: R$ " + produto.calcularTotal());
    }
}
