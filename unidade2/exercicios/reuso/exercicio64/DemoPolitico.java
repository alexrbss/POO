package unidade2.exercicios.reuso.exercicio64;

public class DemoPolitico {
    public static void main(String[] args) {
        Prefeito p = new Prefeito("Raimundo", 555555, "PSD", "Alexandria");
        System.out.println(p);

        Governador g = new Governador("Fatima", 131313, "PT", "Rio Grande do Norte");
        System.out.println(g); 
    }
}
