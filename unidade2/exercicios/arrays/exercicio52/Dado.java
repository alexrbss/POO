package unidade2.exercicios.arrays.exercicio52;

import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        Random random = new Random();
        
        int[] frequenciaSoma = new int[13];

        for (int i=0; i<36000000; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;

            int soma = dado1 + dado2;

            frequenciaSoma[soma]++;
        }
        System.out.println();

        for (int soma=2; soma<=12; soma++) {
            System.out.printf("%02d \t %d%n", soma, frequenciaSoma[soma]);
        }
    }
}
