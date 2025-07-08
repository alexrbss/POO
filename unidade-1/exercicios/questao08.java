/*
    08) Para alavancar as vendas, uma loja resolveu fazer a seguinte promoção relâmpago em dois setores:
        • No setor de Eletros, que possui código 222, todas as peças que custam mais de R$500 vão ter 10% de desconto.
        • No setor de Cama, mesa e banho, que possui código 111, peças com valor acima de R$ 100 vão ter 40% de desconto, peças que custam entre R$ 50 e R$ 100 vão ter 20% de desconto e peças abaixo de R$ 50 vão ter 10% de desconto.
     Escreva um programa que recebe do usuário o código do setor da loja e o valor original de um produto e imprime na tela o nome do setor e o valor do produto com desconto. Caso o usuário forneça um código diferente de 111 ou 222, exiba a mensagem Setor Invalido.
 */

package exercicios;

import java.util.Scanner;

public class questao08 {
    public static void main(String[] args) {
        int codigo;
        double valorOriginal, valorDesconto;
    
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Informe o código do setor: ");
        codigo = leitor.nextInt();

        if (codigo != 111 && codigo != 222) {
            System.out.println("Setor Inválido");
            leitor.close();
            return;
        }

        System.out.println("Informe o valor do produto: ");
        valorOriginal = leitor.nextDouble();
    
        if (codigo == 222 && valorOriginal >= 500.00) {
            valorDesconto = valorOriginal * 0.9;
        } else {
            valorDesconto = valorOriginal;
        }

        if (codigo == 111) {
            if (valorOriginal < 50.00) {
                valorDesconto = valorOriginal * 0.9;
            } else if (valorOriginal >= 50.00 && valorOriginal <= 100.00) {
                valorDesconto = valorOriginal * 0.8;
            } else {
                valorDesconto = valorOriginal * 0.6;
            }
        }

        System.out.printf("Setor: %d\nValor com Desconto: R$ %.2f\n", codigo, valorDesconto);

        leitor.close();

    }
}
