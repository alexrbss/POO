package unidade2.exercicios.arrays.exercicio49;

public class DemoMatriz {
    public static void main(String[] args) {
        float[][] valores = {{1, 2}, {3, 4}};
        Matriz matriz = new Matriz(valores);

        System.out.println("Determinante: " + matriz.calculaDeterminante());
        matriz.imprimeMatriz();
    }
}
