package unidade2.exercicios.reuso.exercicio65;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome, double salario, int matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual() {
        return (this.getSalario() + bonusSalarial) * 13;
    }

    @Override
    public String toString() {
        return "\nASSISTENTE TECNICO:" + super.toString() + "\nGanho Anual: R$" + this.ganhoAnual();
    }
}
