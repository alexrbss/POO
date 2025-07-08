package exercicios.classes2.questao42;

public class DemoGenerica {
    public static void main(String[] args) {
        Generica<Integer> g1 = new Generica<>(1, 2, 1);
        g1.imprime();
        System.out.println("Iguais: " + g1.quantosIguais());

        Generica<String> g2 = new Generica<>("a", "a", "a");
        g2.imprime();
        System.out.println("Iguais: " + g2.quantosIguais());

        Generica<Double> g3 = new Generica<>(1.5, 2.5, 3.5);
        g3.imprime();
        System.out.println("Iguais: " + g3.quantosIguais());
    }    
}
