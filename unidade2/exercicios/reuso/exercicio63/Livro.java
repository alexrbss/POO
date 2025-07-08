package unidade2.exercicios.reuso.exercicio63;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor + "\n";
    }
}
