package unidade2.exercicios.reuso.exercicio61;

public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento eqp = new Equipamento("Eletrodomestico", 5.00);
        System.out.println(eqp);

        Computador comp = new Computador("Eletronico", 2.00, "Apple", "Prata");
        System.out.println(comp);
    }
}
