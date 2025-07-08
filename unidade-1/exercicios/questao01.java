/*
    01) Escreva um programa que calcule a área de um quadrado. O valor do lado de um quadrado deverá ser informado pelo usuário.
 */

package exercicios;

import java.util.Scanner;

public class questao01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        float lado, area;

        System.out.println("Informe o valor do lado do quadrado: ");
        lado = leitor.nextFloat();

        area = lado * lado;

        System.out.printf("A área do quadrado é: %.2f\n", area);

        leitor.close();
    }

}
