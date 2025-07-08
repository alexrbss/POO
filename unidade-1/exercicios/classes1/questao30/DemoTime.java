package exercicios.classes1.questao30;

public class DemoTime {
    public static void main(String[] args) {
        Time time = new Time("Estrela FC", "Carlos Silva");

        time.registrarJogo(2, 1); // vitória
        time.registrarJogo(1, 1); // empate
        time.registrarJogo(0, 3); // derrota

        System.out.println(time);
    }
}