package unidade2.exercicios.reuso.exercicio61;

public class Equipamento {
    private String tipo;
    private double peso;

    public Equipamento(String tipo, double peso) {
        this.tipo = tipo;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + "\n" + "Peso: " + peso + "\n";
    }
}
