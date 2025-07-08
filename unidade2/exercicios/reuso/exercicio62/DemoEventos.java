package unidade2.exercicios.reuso.exercicio62;

public class DemoEventos {
    public static void main(String[] args) {
        EventoDelegacao evento1 = new EventoDelegacao("25/10/2025", "19:00", "Meu aniversario");
        System.out.println(evento1);

        EventoHeranca evento2 = new EventoHeranca("30/03/2025", "15:00", "Aniversario de Biel");
        System.out.println(evento2);
    }
}
