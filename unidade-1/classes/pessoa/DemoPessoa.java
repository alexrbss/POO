package classes.pessoa;

public class DemoPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lucaz", 1.78);
        
        System.out.println(pessoa.toString());
        
        pessoa.setNome("Carla");
        
        System.out.println(pessoa.getNome());

    }
}
