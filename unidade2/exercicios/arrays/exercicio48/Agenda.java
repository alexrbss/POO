package unidade2.exercicios.arrays.exercicio48;

import java.util.List;
import java.util.ArrayList;

public class Agenda {
    private List<EntradaEmAgenda> lista = new ArrayList<>();

    public Agenda (List<EntradaEmAgenda> lista) {
        this.lista = lista;
    }

    public void adicionarCompromisso (EntradaEmAgenda compromisso) {
        lista.add(compromisso);
    }

    public void listaDia (int dia, int mes, int ano) {
        for (EntradaEmAgenda compromisso : lista) {
            if (compromisso.ehNoDia(dia, mes, ano) ) {
                System.out.println(compromisso);
            }
        }
    }
}
