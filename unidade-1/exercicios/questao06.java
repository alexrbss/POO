/*
    06) Escreva um programa que recebe um valor inteiro representando um intervalo em minutos e imprime o equivalente a esse período expresso em valores inteiros para dias, horas e minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.
 */

package exercicios;

import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) {
        double intervalo, dias, horas, minutos;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o intervalo: ");
        intervalo = leitor.nextInt();

        dias = (int) (intervalo / 1440);
        horas = (int) ((intervalo % 1440) / 60);
        minutos = (int) ((intervalo % 1440) % 60);

        System.out.printf("%d minutos = %d dias, %d horas e % minutos", (int) intervalo, dias, horas, minutos);

        leitor.close();
    }
}
