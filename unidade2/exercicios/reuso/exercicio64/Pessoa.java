package unidade2.exercicios.reuso.exercicio64;

public class Pessoa {
    private String nome;
    private int id;

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nID: " + id;
    }
}
