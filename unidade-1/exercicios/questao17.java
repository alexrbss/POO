/*
    17) Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A cidade A tem um crescimento populacional de 3,5% ao ano, enquanto a população da cidade B cresce 1% ao ano. Faça um programa que utilize laço(s) para calcular a quantidade de anos necessária para que a população da cidade A seja maior ou igual a população da cidade B.
 */

package exercicios;

public class questao17 {
    public static void main(String[] args) {
        double populacaoA = 7000, populacaoB = 20000;
        int ano = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * 0.035;
            populacaoB += populacaoB * 0.01;

            ano++;
        }

        System.out.println("Serão necessários " + ano + " anos");
    }
}
