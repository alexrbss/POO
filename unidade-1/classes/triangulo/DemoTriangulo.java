package classes.triangulo;

public class DemoTriangulo {
    public static void main(String[] args) {
        Triangulos t1 = new Triangulos(); // Cria um objeto do tipo Triangulos
        t1.incializaTriangulo(2.3, 3.3, 4.5, "Triângulo Escaleno");
        
        Triangulos t2 = new Triangulos(); // Cria um objeto do tipo Triangulos
        t2.incializaTriangulo(2.3, 3.3, 4.5, "Triângulo Escaleno");

        Triangulos t3;
        t3 = t1;

        System.out.println(t1 == t2); // false, pois são objetos diferentes
        System.out.println(t1 == t3); // true, pois t3 é uma referência para o mesmo objeto que t1
    }
}
