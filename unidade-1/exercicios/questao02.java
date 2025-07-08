/*
    02) Escreva um programa que calcule a soma e a média aritmética de 3 números. Os 3
    valores reais serão informados pelo usuário
 */

package exercicios;

import java.util.Scanner;

public class questao02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float n1, n2, n3, soma, media;

        System.out.println("Informe o primeiro numero: ");
        n1 = leitor.nextFloat();
        System.out.println("Informe o segundo numero: ");
        n2 = leitor.nextFloat();
        System.out.println("Informe o terceiro numero: ");
        n3 = leitor.nextFloat();

        soma = n1 + n2 + n3;
        media = soma / 3;

        System.out.printf("A soma dos numeros eh: %.2f\n", soma);
        System.out.printf("A média aritmetica dos numeros eh: %.2f\n", media);

        leitor.close();

    }
}
