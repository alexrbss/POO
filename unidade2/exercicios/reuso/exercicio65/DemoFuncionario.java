package unidade2.exercicios.reuso.exercicio65;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Joao", 3000);
        Assistente a = new Assistente("Maria", 2500, 123);
        Tecnico t = new Tecnico("Carlos", 2800, 456, 300);
        Administrativo ad = new Administrativo("Ana", 2600, 789, "noite", 400);

        System.out.println(f);
        System.out.println(a);
        System.out.println(t);
        System.out.println(ad);
    }
}
