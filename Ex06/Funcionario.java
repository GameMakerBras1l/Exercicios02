package Ex06;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    // Define o salário inicial
    public Funcionario(String nome, String cargo, double salario) {
        setNome(nome);
        setCargo(cargo);

        if (salario > 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("Salário inválido!");
        }
    }

    // Aumenta o salário por percentual
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            salario += salario * (percentual / 100);
            System.out.println("Aumento de " + percentual + "% aplicado!");
        } else {
            System.out.println("Percentual inválido!");
        }
    }
}
