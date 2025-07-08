package unidade2.exercicios.reuso.exercicio64;

public class Politico extends Pessoa {
    private String partido;

    public Politico(String nome, int id, String partido) {
        super(nome, id);
        this.partido = partido;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPartido: " + partido;
    }
}
