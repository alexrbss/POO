package unidade2.exercicios.reuso.exercicio63;

public class LivroLivraria extends Livro {
    private int quantidade;
    private double preco;
    
    public LivroLivraria(String titulo, String autor, int quantidade, double preco) {
        super(titulo, autor);
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "LIVRO LIVRARIA\n" + super.toString() + "Quantidade: " + quantidade + "\nPreco: R$" + preco + "\n";
    }
}
