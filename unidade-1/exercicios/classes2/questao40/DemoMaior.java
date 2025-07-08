package exercicios.classes2.questao40;

public class DemoMaior {
    public static void main(String[] args) {
        System.out.println("Maior entre 2 int: " + Maior.maior(3, 7));
        System.out.println("Maior entre 3 int: " + Maior.maior(3, 7, 5));
        System.out.println("Maior entre 4 int: " + Maior.maior(3, 7, 5, 10));
        System.out.println("Maior entre 5 int: " + Maior.maior(3, 7, 5, 10, 2));

        System.out.println("Maior entre 2 double: " + Maior.maior(3.5, 7.2));
        System.out.println("Maior entre 3 double: " + Maior.maior(3.5, 7.2, 5.1));
        System.out.println("Maior entre 4 double: " + Maior.maior(3.5, 7.2, 5.1, 10.8));
        System.out.println("Maior entre 5 double: " + Maior.maior(3.5, 7.2, 5.1, 10.8, 2.3));
    }
}
