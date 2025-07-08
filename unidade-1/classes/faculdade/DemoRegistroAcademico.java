package classes.faculdade;

public class DemoRegistroAcademico {
    public static void main(String[] args) {
        RegistroAcademico r1 = new RegistroAcademico("Maria", 1, 0.8);
        RegistroAcademico r2 = new RegistroAcademico("João", 2, 1.0);
        RegistroAcademico r3 = new RegistroAcademico("Ana", 3, 0.9);

        System.out.println(r1);
        System.out.println();
        System.out.println(r2);
        System.out.println();
        System.out.println(r3);
    }
}
