package pilha;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        // Polimorfismo de inclusão
        Stack<Number> pilha = new Stack<>();
        System.out.println(pilha);
        pilha.push(4);
        System.out.println(pilha);
        pilha.push(3.1865);
        System.out.println(pilha);
        pilha.push(1.23F);
        System.out.println(pilha);

        System.out.println("Removido: " + pilha.pop());
        System.out.println(pilha);
        System.out.println("Removido: " + pilha.pop());
        System.out.println(pilha);
        System.out.println("Removido: " + pilha.pop());
        System.out.println(pilha);

    }
}
