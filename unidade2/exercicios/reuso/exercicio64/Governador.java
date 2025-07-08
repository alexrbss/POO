package unidade2.exercicios.reuso.exercicio64;

public class Governador extends Politico {
    private String estado;

    public Governador(String nome, int id, String partido, String estado) {
        super(nome, id, partido);
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\nGOVERNADOR:\n" + super.toString() + "\nEstado: " + estado;
    }
}
