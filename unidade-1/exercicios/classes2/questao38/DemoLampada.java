package exercicios.classes2.questao38;

public class DemoLampada {
    public static void main (String[] args) {
        Lampada lampada = new Lampada();

        lampada.mostraEstado();
        lampada.acende();
        lampada.mostraEstado();
        lampada.acende(); // não conta novamente se já está acesa
        lampada.apaga();
        lampada.mostraEstado();
        lampada.acende();
        lampada.mostraEstado();

        lampada.mostraQuantidadeAcesa();
    }
}