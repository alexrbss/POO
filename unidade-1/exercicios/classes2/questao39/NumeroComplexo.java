package exercicios.classes2.questao39;

public class NumeroComplexo {
    private double real;
    private double imaginario;

    // 1o Construtor
    public NumeroComplexo (double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    // 2o Construtor
    public NumeroComplexo (double real) {
        this.real = real;
        this.imaginario = 0;
    }

    // 3o Construtor
    public NumeroComplexo () {
        this.real = 0;
        this.imaginario = 0;
    }

    public String toString() {
        if (imaginario == 0) {
            return String.format("%.0f", real);
        } else if (real ==  0) {
            return String.format("%.0fi", imaginario);
        } else if (imaginario > 0) {
            return String.format("%.0f + %.0fi", real, imaginario);
        } else {
            return String.format("%.0f - %.0fi", real, -imaginario);
        }
    }
}
