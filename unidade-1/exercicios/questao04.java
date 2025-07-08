/*
    04) Escreva um programa que receba uma temperatura em graus centígrados e a apresente em graus Fahrenheit. (F = C x 1,8 + 32)
 */

package exercicios;

import java.util.Scanner;

public class questao04 {
    public static void main(String[] args) {
        double grauC, grauF;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o °C:");
        grauC = leitor.nextDouble();

        grauF = (grauC * 1.8) + 32;
        
        System.out.printf("%.0f°C = %.0f°F", grauC, grauF);

        leitor.close();
    }
}
