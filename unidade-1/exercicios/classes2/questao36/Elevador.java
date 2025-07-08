package exercicios.classes2.questao36;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasNoElevador;

    public Elevador(int totalAndares, int capacidadeElevador) {
        this.andarAtual = 0; // Térreo
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.pessoasNoElevador = 0;
    }

    public void entra() {
        if (pessoasNoElevador < capacidadeElevador) {
            pessoasNoElevador++;
        } else {
            System.out.println("Não é possível entrar pois o elevador encontra-se cheio!");
        }
    }

    public void sai() {
        if (pessoasNoElevador > 0) {
            pessoasNoElevador--;
        } else {
            System.out.println("Não foi possível remover pois o elevador encontra-se vazio!");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Não é possível subir pois o elevador encontra-se no uíltimo andar");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Não é possível descer pois o elevador encontra-se no térreo");
        }
    }

    public String toString() {
        return String.format("Andar Atual: %d\nCapacidade Elevador: %d\nPessoas no Elevador: %d", andarAtual, capacidadeElevador, pessoasNoElevador);
    }
}
