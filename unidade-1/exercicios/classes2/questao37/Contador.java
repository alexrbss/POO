package exercicios.classes2.questao37;

public class Contador {
    private int contador;

    public Contador() {
        contador = 0; 
    }

    public void zerar() {
        contador = 0;
    }

    public void incrementar() {
        contador++;
    }

    public void imprimir() {
        System.out.print(contador);
    }
}
