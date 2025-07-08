package unidade2.exercicios.reuso.exercicio63;

public class LivroBiblioteca extends Livro {
    private int numeroExemplares;

    public LivroBiblioteca(String titulo, String autor, int numeroExemplares) {
        super(titulo, autor);
        this.numeroExemplares = numeroExemplares;
    }

    public String estaDisponivel() {
        if (numeroExemplares > 0) {
            return "Livro Disponivel!";
        } else {
            return "Livro Indisponivel!";
        }
    }

    @Override
    public String toString() {
        return "LIVRO BIBLIOTECA\n" + super.toString() + "Numero de Exemplares: " + numeroExemplares + "\n" + estaDisponivel(); 
    }
}
