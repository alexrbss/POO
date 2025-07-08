package remocaoCores;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveCores {
    public static void main(String[] args) {
        LinkedList<String> listaCores = new LinkedList<>(Arrays.asList("azul", "amarelo", "cinza", "rosa", "verde", "vermelho", "preto"));
        LinkedList<String> remover = new LinkedList<>(Arrays.asList("amarelo", "verde"));
        
        System.out.println(listaCores);

        remove(listaCores, remover);

        System.out.println(listaCores);
    }

    public static void remove(LinkedList<String> listaCompleta, LinkedList<String> listaDeRemocao) {
        Iterator<String> itera = listaCompleta.iterator();

        while(itera.hasNext()) {
            if (listaDeRemocao.contains(itera.next())) {
                itera.remove();
            }
        }
    }
}
