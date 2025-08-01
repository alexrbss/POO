package classes.triangulo;

public class Triangulos {
    private double l1;
    private double l2;
    private double l3;
    private String desc;

    public void incializaTriangulo(double lado1, double lado2, double lado3, String descricao) {
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        desc = descricao;
    }

    public double calculaPerimetro() {
        return l1 + l2 + l3;
    }

}
