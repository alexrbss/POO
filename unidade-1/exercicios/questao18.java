/*
    18) Crie uma função recursiva potencia (base,expoente) que, quando chamada, retorna base^expoente. Por exemplo, potencia(3,4) deve ser implementado como 3 ∗ 3 ∗ 3 ∗ 3. (A saída é apenas 81 nesse exemplo). Assuma que expoente é um inteiro maior ou igual a 1.
 */
package exercicios;

public class questao18 {
    public static int potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        }
        return base * potencia(base, expoente - 1); 
    }

    public static void main(String[] args) {
        System.out.println(potencia(3, 4)); // Saída: 81
    }    
}
