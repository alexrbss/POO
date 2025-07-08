/*
    05) Escreva um programa que receba um número de 3 dígitos no formato CDU (Centena, Dezena e Unidade) e, utilizando operadores aritméticos, armazene cada dígito em uma variável de tipo inteiro. Por fim, reescreva o número no formato UCD em outra variável de tipo inteiro e o imprima. Exemplo: 123 deve ser reescrito como 312.
 */

package exercicios;

import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) {
        String numero;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe um número com 3 dígitos: ");
        numero = leitor.nextLine();

        String[] partes = numero.split("");

        int centena = Integer.parseInt(partes[0]);
        int dezena = Integer.parseInt(partes[1]);
        int unidade = Integer.parseInt(partes[2]);

        System.out.printf("%d%d%d", unidade, dezena, centena);

        leitor.close();
    }
}
