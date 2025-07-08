package excecoes;

public class Prova {
    public static void main(String[] args) {
        int respostas[] = {0, 1, 3, 2, 5, 14, 2, 2, 3, 0};
        int contador[] = new int[6];

        for(int i = 0; i < contador.length; i++) {
            contador[i] = 0;
        }

        for (int resp : respostas) {
            try {
                contador[resp]++;
            } catch (ArrayIndexOutOfBoundsException excecao) {
                System.out.println("A resposta " + resp + " nao eh valida e nao foi contabilizada");
            }
        }

        for(int i = 0; i < contador.length; i++) {
            System.out.println("A resposta " + i + " ocorreu " + contador[i] + " vezes");
        }
    }
}