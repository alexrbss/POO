import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class BuscaCor {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("preto");
        cores.add("vermelho");
        cores.addAll(Arrays.asList("laranja", "verde", "rosa", "amarelo"));
        System.out.println(cores);
        Collections.sort(cores);
        System.out.println(cores);

        buscaString(cores, "cinza");
        buscaString(cores, "rosa");
    }

    public static void buscaString(ArrayList<String> arrayList, String alvo) {
        if (arrayList.contains(alvo)) {
            int posicao = Collections.binarySearch(arrayList, alvo);
            System.out.println(alvo + " esta na posicao " + posicao + " da lista");
        } else {
            System.out.println(alvo + " nao esta na lista");
        }
    }

 }