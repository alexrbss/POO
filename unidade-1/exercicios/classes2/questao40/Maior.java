package exercicios.classes2.questao40;

public class Maior {
    // Int
    public static int maior(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int maior(int a, int b, int c) {
        return maior(maior(a, b), c);
    }

    public static int maior(int a, int b, int c, int d) {
        return maior(maior(a, b, c), d);
    }

    public static int maior(int a, int b, int c, int d, int e) {
        return maior(maior(a, b, c, d), e);
    }

    // Double
    public static double maior(double a, double b) {
        return (a > b) ? a : b;
    }

    public static double maior(double a, double b, double c) {
        return maior(maior(a, b), c);
    }

    public static double maior(double a, double b, double c, double d) {
        return maior(maior(a, b, c), d);
    }

    public static double maior(double a, double b, double c, double d, double e) {
        return maior(maior(a, b, c, d), e);
    }
}
