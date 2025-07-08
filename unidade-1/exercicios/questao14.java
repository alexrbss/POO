/*
    14) Escreva um programa que apresente a série de Fibonacci até o n-ézimo termo. Assuma que n > 0.
 */

package exercicios;

import java.util.Scanner;;

public class questao14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o valor de n: ");
        int n = leitor.nextInt();

        if (n < 0) {
            System.out.println("Valor Inválido, n deve ser um valor positivo!");
            leitor.close();
            return;
        }

        int primeiro = 0, segundo = 1;

        System.out.println("Serie de Fibonacci de " + n);
        for (int i = 1; i <= n; i++) {
            System.out.print(primeiro + " ");
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        leitor.close();
    }
}
