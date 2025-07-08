package classes.conversor;

public class DemoConversao {
    public static void main(String[] args) {
        System.out.println("5 polegadas = " + Unidades.pesParaCentimetros(5.0) + " centimetros");

        System.out.println("5 pés = " + Unidades.pesParaCentimetros(5.0) + " centimetros");

        System.out.println("5 milhas = " + Unidades.milhasParaQuilometros(5.0) + " quilometros");
    }
}
