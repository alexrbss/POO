/*
    09)  Escreva um programa que lê um número que representa o valor da carta, de um (ás) a treze (rei), e outro número correspondente ao naipe (1 = ouros, 2 = paus, 3 = copas e 4 = espadas). O programa deve imprimir o nome da carta por extenso
 */
package exercicios;

import java.util.Scanner;

public class questao09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int valorCarta, naipe;

        System.out.println("Informe o valor da carta: ");
        valorCarta = leitor.nextInt();

        System.out.println("Informe o valor do naipe: ");
        naipe = leitor.nextInt();

        String nomeCarta = null; 
        String nomeNaipe = null;

        switch (valorCarta) {
            case 1:
                nomeCarta = "Ás";
                break;
            case 2:
                nomeCarta = "Dois";
                break;
            case 3:
                nomeCarta = "Três";
                break;
            case 4:
                nomeCarta = "Quatro";
                break;
            case 5:
                nomeCarta = "Cinco";
                break;
            case 6:
                nomeCarta = "Seis";
                break;
            case 7:
                nomeCarta = "Sete";
                break;
            case 8:
                nomeCarta = "Oito";
                break;
            case 9:
                nomeCarta = "Nove";
                break;
            case 10:
                nomeCarta = "Dez";
                break;
            case 11:
                nomeCarta = "Valete";
                break;
            case 12:
                nomeCarta = "Dama";
                break;
            case 13:
                nomeCarta = "Rei";
                break;
            default:
                System.out.println("Valor Inválido");
                leitor.close();
                return;
        }

        switch (naipe) {
            case 1:
                nomeNaipe = "Ouros";
                break;
            case 2:
                nomeNaipe = "Paus";
                break;
            case 3:
                nomeNaipe = "Copas";
            case 4:
                nomeNaipe = "Espadas";
            default:
                System.out.println("Valor Inválido");
                leitor.close();
                return;
        }

        System.out.printf("%s de %s\n", nomeCarta, nomeNaipe);
        
        leitor.close();

    }
}
