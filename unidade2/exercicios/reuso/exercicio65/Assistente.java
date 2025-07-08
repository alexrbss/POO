package unidade2.exercicios.reuso.exercicio65;

public class Assistente extends Funcionario {
    private int matricula;

    public Assistente(String nome, double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "\nMatricula: " + matricula + super.toString();
    }
}
