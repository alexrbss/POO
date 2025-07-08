package unidade2.exercicios.reuso.exercicio65;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double valorAumento) {
        salario += valorAumento;
    }

    public double ganhoAnual() {
        return salario * 13;
    }

    public String toString() {
        return "\nNome: " + nome + "\nSalario: " + salario;
    }
}
