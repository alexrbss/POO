/*
    16) Escreva um programa que determine quais são todos os números de 3 algarismos cuja soma dos cubos de seus algarismos sejam iguais ao próprio número.
        • Exemplo: 153 = 1³ + 5³ + 3³ = 1  + 125 + 27
 */

package exercicios;

public class questao16 {
    public static void main(String[] args) {
        // Verifica todos os números de 3 algarismos

        for (int i = 100; i <= 999; i++) {
            int centenas = i / 100; // Extrai a centena
            int dezenas = (i / 10) % 10; // Extrai a dezena
            int unidades = i % 10; // Extrai a unidade

            // Calcula a soma dos cubos dos algarismos
            int somaCubos = (int) (Math.pow(centenas, 3) + Math.pow(dezenas, 3) + Math.pow(unidades, 3));

            // Verifica se a soma dos cubos é igual ao próprio número
            if (somaCubos == i) {
                System.out.println(i); // Imprime o número que atende à condição
            }
        }
    }
}
