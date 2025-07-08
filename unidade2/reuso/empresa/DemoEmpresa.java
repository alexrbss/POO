package unidade2.reuso.empresa;

public class DemoEmpresa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Alex", 252525);
        System.out.println(p);

        Funcionario f = new Funcionario("Gabriel", 303030, 20550.00);
        System.out.println(f);

        ChefeDeDepartamento c = new ChefeDeDepartamento("Pedro", 888833, 3000.00, "TI");

        System.out.println(c);
    }
}
