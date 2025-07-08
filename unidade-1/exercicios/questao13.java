/*
    13)  Escreva um programa para imprimir uma versão aproximada de um cartão da Mega-Sena (somente com os números, respeitando o número de linhas e a distribuição dos números nas linhas)
 */

package exercicios;

public class questao13 {
    public static void main(String[] args) {
        int numero = 1;

        for (int linha = 1; linha <= 6; linha++) {
            for (int coluna = 1; coluna <= 10; coluna++) {
                System.out.printf("[%02d] ", numero);
                numero++;
            }
        System.out.println();
        }
    }
}