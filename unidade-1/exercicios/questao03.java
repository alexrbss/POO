/*
    03) Escreva um programa que receba um ângulo em graus e o converta para sua representação em radianos. Divulgue também seno, cosseno, tangente, cossecante, secante e cotangente do ângulo.
 */

package exercicios;

import java.util.Scanner;

public class questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ângulo em graus: ");
        double graus = scanner.nextDouble();

        double radianos = Math.toRadians(graus);
        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        double cossecante = 1 / seno;
        double secante = 1 / cosseno;
        double cotangente = 1 / tangente;

        System.out.println("Ângulo em radianos: " + radianos);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: " + secante);
        System.out.println("Cotangente: " + cotangente);

        scanner.close();
    }
}
 