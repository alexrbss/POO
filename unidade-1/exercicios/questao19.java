package exercicios;

public class questao19 {
    public static int fatorial(int n, int nivel) {
        // Caso base
        if (n == 0) {
            imprimeComRecuo(nivel, n + "! = 1");
            return 1;
        }

        // Chamada recursiva
        int resultado = n * fatorial(n - 1, nivel + 1);

        // Impressão na volta da recursão
        imprimeComRecuo(nivel, n + "! = " + resultado);

        return resultado;
    }

    // Método auxiliar para imprimir com recuo
    public static void imprimeComRecuo(int nivel, String texto) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println(texto);
    }

    public static void main(String[] args) {
        int numero = 5;
        fatorial(numero, 0);
    }
}
