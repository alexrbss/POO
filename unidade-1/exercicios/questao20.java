package exercicios;

public class questao20 {
    public static int mdc(int m, int n) {
        if (n > m) {
            return mdc(n, m);
        } else if (n == 0) {
            return m;
        } else {
            return mdc(n, m % n);
        }
    }

    public static void main(String[] args) {
        System.out.println(mdc(48, 18)); // Saída: 6
    }  
}
