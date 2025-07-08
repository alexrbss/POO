package exercicios.classes2.questao39;

public class DemoNumeroComplexo {
    public static void main(String[] args) {
        NumeroComplexo n1 = new NumeroComplexo(2, 4);
        NumeroComplexo n2 = new NumeroComplexo(5);
        NumeroComplexo n3 = new NumeroComplexo();

        System.out.println("n1: " + n1); // 2 + 4i
        System.out.println("n2: " + n2); // 5
        System.out.println("n3: " + n3); // 0
    }
}