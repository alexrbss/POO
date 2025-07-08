package unidade2.exercicios.arrays.exercicio50;

public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private int telefone;

    public Cliente (int id, String nome, int idade, int telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public String toString() {
        return "ID: " + id + "\n" + "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Telefone: " + telefone + "\n";
    }
}
