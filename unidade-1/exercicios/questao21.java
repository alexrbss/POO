package exercicios;

public class questao21 {
    public static boolean ehPrimo(int n) {
        return ehPrimoRec(n, 2);
    }

    private static boolean ehPrimoRec(int n, int divisor) {
        if (n <= 1) return false;
        if (divisor > Math.sqrt(n)) return true;
        if (n % divisor == 0) return false;
        return ehPrimoRec(n, divisor + 1);
    }

    public static void main(String[] args) {
        System.out.println(ehPrimo(7));  // true
        System.out.println(ehPrimo(10)); // false
    }
}    
