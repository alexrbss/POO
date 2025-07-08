package unidade2.exercicios.reuso.exercicio61;

public class Computador extends Equipamento {
    private String marca;
    private String cor;

    public Computador(String tipo, double peso, String marca, String cor) {
        super(tipo, peso);
        this.marca = marca;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + "Marca: " + marca + "\n" + "Cor: " + cor + "\n";
    }
}
