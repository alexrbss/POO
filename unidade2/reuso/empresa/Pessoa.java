package unidade2.reuso.empresa;

public class Pessoa {
    private String nome;
    private int identidade;

    public Pessoa(String nome, int identidade) {
        this.nome = nome;
        this.identidade = identidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentidade() {
        return identidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Identidade: " + identidade;
    }
}
