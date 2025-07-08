package unidade2.reuso.concessionaria;

public class DemoConcessionaria {
    public static void main(String[] args) {
        AutomovelDeLuxo auto = new AutomovelDeLuxo(2023, "ferrari", "vermelho", true, true, true, true);
        System.out.println(auto);
        System.out.println(auto.quantoCusta());
    }    
}
