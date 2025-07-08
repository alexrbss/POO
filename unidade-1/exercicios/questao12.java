/*
    12) O mês de fevereiro de 2015 começou em um domingo. Escreva um programa que, dado o número de um dia do mês de fevereiro de 2015 (um valor entre 1 e 28), imprime o dia da semana correspondente.
        • Exemplo de entrada: 10
        • Exemplo de saída: O dia 10 será uma terça-feira.
 */
package exercicios;

import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        int dia;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        dia = leitor.nextInt();

        String valorDia = null;

        switch (dia) {
            case 1, 8, 15, 22:
                valorDia = "domingo";
                break;
            case 2, 9, 16, 23:
                valorDia = "segunda-feira";
                break;
            case 3, 10, 17, 24:
                valorDia = "terça-feira";
                break;
            case 4, 11, 18, 25:
                valorDia = "quarta-feira";
                break;
            case 5, 12, 19, 26:
                valorDia = "quinta-feira";
                break;
            case 6, 13, 20, 27:
                valorDia = "sexta-feira";
                break;
            case 7, 14, 21, 28:
                valorDia = "sábado";
                break;
            default:
                System.out.println("Valor Inválido");
                leitor.close();
                return;
        }

        System.out.printf("O dia %d será %s\n", dia, valorDia);
        leitor.close();
        
    }
}
