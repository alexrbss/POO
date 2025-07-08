package unidade2.exercicios.arrays.exercicio52;

import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        final int NUM_ROLLS = 36_000_000;
        int[] sumFrequencies = new int[13]; // índices de 0 a 12, mas só usaremos 2 a 12

        Random random = new Random();

        for (int i = 0; i < NUM_ROLLS; i++) {
            int die1 = random.nextInt(6) + 1; // 1..6
            int die2 = random.nextInt(6) + 1; // 1..6
            int sum = die1 + die2;
            sumFrequencies[sum]++;
        }

        System.out.printf("Soma  Frequência%n");
        System.out.println("-------------------");
        for (int sum = 2; sum <= 12; sum++) {
            System.out.printf("%4d  %10d%n", sum, sumFrequencies[sum]);
        }
    }
}

