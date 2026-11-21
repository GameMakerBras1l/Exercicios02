package Ex02;

public class Main {
    public static void main(String[] args) {

        // Primeiro aluno
        Aluno aluno1 = new Aluno();

        aluno1.setNome("Carlos");
        aluno1.setMatricula("2026001");
        aluno1.setCurso("Análise e Desenvolvimento de Sistemas");

        // Segundo aluno
        Aluno aluno2 = new Aluno();

        aluno2.setNome("Maria");
        aluno2.setMatricula("2026002");
        aluno2.setCurso("Administração");

        // Exibindo os alunos
        System.out.println("=== Aluno 1 ===");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Curso: " + aluno1.getCurso());

        System.out.println("\n=== Aluno 2 ===");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Matrícula: " + aluno2.getMatricula());
        System.out.println("Curso: " + aluno2.getCurso());

        // Desafio: alterar o curso
        aluno2.setCurso("Ciência da Computação");

        System.out.println("\n=== Curso atualizado ===");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Novo curso: " + aluno2.getCurso());
    }
}
