package unidade2.exercicios.reuso.exercicio64;

public class Prefeito extends Politico {
    private String cidade;

    public Prefeito(String nome, int id, String partido, String cidade) {
        super(nome, id, partido);
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "\nPREFEITO:\n" + super.toString() + "\nCidade: " + cidade;
    }
}
