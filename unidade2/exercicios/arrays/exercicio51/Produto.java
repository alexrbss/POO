package unidade2.exercicios.arrays.exercicio51;

public class Produto {
    public int produto(int... numeros) {
        int resultado = 1;
        for (int numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }
}
