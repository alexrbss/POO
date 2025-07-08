/*
    11) Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e informa se o segundo ponto está acima, abaixo, à esquerda e/ou à direita do primeiro.
 */
package exercicios;

import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        double x1, y1, x2, y2;
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("x1: ");
        x1 = leitor.nextDouble();
        System.out.print("y1: ");
        y1 = leitor.nextDouble();

        System.out.print("x2: ");
        x2 = leitor.nextDouble();
        System.out.print("y2: ");
        y2 = leitor.nextDouble();

        if (y2 > y1) {
            System.out.println("O segundo ponto está acima do primeiro.");
        } else if (y2 < y1) {
            System.out.println("O segundo ponto está abaixo do primeiro.");
        }

        if (x2 > x1) {
            System.out.println("O segundo ponto está à direita do primeiro.");
        } else if (x2 < x1) {
            System.out.println("O segundo ponto está à esquerda do primeiro.");
        }

        leitor.close();
    }
}
