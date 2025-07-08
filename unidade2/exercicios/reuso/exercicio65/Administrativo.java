package unidade2.exercicios.reuso.exercicio65;

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        if (turno.equals("noite")) {
            return ((this.getSalario() + adicionalNoturno) * 12) + this.getSalario();
        } else {
            return this.getSalario() * 13;
        }
    }

    @Override
    public String toString() {
        return "\nASSISTENTE ADMINISTRATIVO:" + super.toString() + "\nGanho Anual: R$" + this.ganhoAnual();
    }
}
