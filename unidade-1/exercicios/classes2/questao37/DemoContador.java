package exercicios.classes2.questao37;

public class DemoContador {
    public static void main (String[] args) {
        Contador contador = new Contador();

        contador.imprimir();

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();

        contador.imprimir();

        contador.zerar();

        contador.imprimir();
    }
}
