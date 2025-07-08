/*
    07) Escreva um programa que lê três números e determina qual número é o menor.
 */
package exercicios;

import java.util.Scanner;

public class questao07 {
    public static void main(String[] args) {
        int n1, n2, n3;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        n1 = leitor.nextInt();
        
        System.out.println("Informe o segundo número: ");
        n2 = leitor.nextInt();

        System.out.println("Informe o terceiro número: ");
        n3 = leitor.nextInt();

        if (n1 <= n2 && n1 <= n3) {
            System.out.println(n1);
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

        leitor.close();
    }
}
