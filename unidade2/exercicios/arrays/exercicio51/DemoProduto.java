package unidade2.exercicios.arrays.exercicio51;

public class DemoProduto {
    public static void main (String[] args) {
        Produto prod = new Produto();

        System.out.println(prod.produto(2, 3, 4));
        System.out.println(prod.produto(5, 10));
        System.out.println(prod.produto(7));
        System.out.println(prod.produto());
    }
}
