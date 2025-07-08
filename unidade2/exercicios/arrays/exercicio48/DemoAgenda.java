package unidade2.exercicios.arrays.exercicio48;

import java.util.ArrayList;

public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(new ArrayList<>());

        agenda.adicionarCompromisso(new EntradaEmAgenda(10, 25, 10, 2025, "Reuniao de trabalho"));
        agenda.adicionarCompromisso(new EntradaEmAgenda(14, 25, 10, 2025, "Almoco com amigos"));

        System.out.println("Compromissos na data do aniversário:");
        agenda.listaDia(25, 10, 2025);
    }
}
