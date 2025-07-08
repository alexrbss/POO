package unidade2.reuso.empresa;

public class ChefeDeDepartamento extends Funcionario {
    private String departamento;

    public ChefeDeDepartamento(String nome, int identidade, double salario, String departamento) {
        super(nome, identidade, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String toString() {
        return super.toString() + ", Departamento: " + departamento;
    }
}
