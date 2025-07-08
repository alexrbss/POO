/*
    15) Escreva um programa que escreve os 4 primeiros números perfeitos. Um número perfeito é aquele que é igual à soma dos seus divisores (exceto o próprio número). 
        Exemplos: 6=1+2+3,28=1+2+4+7+14.
 */
package exercicios;

public class questao15 {
    public static void main(String[] args) {
        int count = 0; // Contador de números perfeitos encontrados
        int num = 1; // Número a ser verificado

        while (count < 4) { // Enquanto não encontrarmos 4 números perfeitos
            int somaDivisores = 0; // Soma dos divisores do número atual

            // Verifica os divisores do número atual
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    somaDivisores += i; // Adiciona o divisor à soma
                }
            }

            // Verifica se o número é perfeito
            if (somaDivisores == num) {
                System.out.println(num); // Imprime o número perfeito encontrado
                count++; // Incrementa o contador
            }

            num++; // Passa para o próximo número
        }
    }
}

