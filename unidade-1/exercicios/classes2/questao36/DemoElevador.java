package exercicios.classes2.questao36;

public class DemoElevador {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 3);
        
        elevador.entra();
        elevador.entra();
        elevador.entra();

        elevador.sobe();
        elevador.sobe();

        elevador.entra();

        // elevador.sai();

        // elevador.sobe();
        
        // elevador.sai();
        // elevador.sai();

        // elevador.sobe();

        System.out.print(elevador);
    }
}
