import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double n1, n2, n3, m;

        System.out.print("Primeiro numero: ");
        n1 = leitor.nextDouble();
        System.out.print("Segundo numero: ");
        n2 = leitor.nextDouble();
        System.out.print("Terceiro numero: ");
        n3 = leitor.nextDouble();

        m = media(n1, n2, n3);

        System.out.println("Media de " + n1 + ", " + n2 + " eh " + n3 + " = " + m);

        leitor.close();
    }

    public static double media(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
}
