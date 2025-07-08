package classes.banco;

public class DemoBanco {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Alex", 1000.0F, true);
        ContaBancaria conta2 = new ContaBancaria("Maria");

        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
    }
}
