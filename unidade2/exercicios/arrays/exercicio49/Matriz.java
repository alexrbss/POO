package unidade2.exercicios.arrays.exercicio49;

public class Matriz {
    private float[][] matriz = new float[2][2];

    public Matriz (float[][] matriz) {
        this.matriz = matriz;
    }

    public float calculaDeterminante() {
        float a = matriz[0][0];
        float b = matriz[0][1];
        float c = matriz[1][0];
        float d = matriz[1][1];

        return (a * d) - (b * c);
    }

    public void imprimeMatriz() {
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
