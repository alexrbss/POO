package unidade2.exercicios.reuso.exercicio63;

public class DemoLivro {
    public static void main(String[] args) {
        LivroLivraria livro1 = new LivroLivraria("Pachinko", "Min Jin Lee", 5, 50.00);
        System.out.println(livro1);

        LivroBiblioteca livro2 = new LivroBiblioteca("Verity", "Collen Hoover", 10);
        System.out.println(livro2);

        LivroBiblioteca livro3 = new LivroBiblioteca("Lola", "Lana", 0);
        System.out.println(livro3);
    }
}
