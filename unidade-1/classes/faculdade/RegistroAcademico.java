package classes.faculdade;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private int codigoCurso;
    private double percentualCobranca;
    private static int numeroDeMatriculas = 0;

    public RegistroAcademico(String nome, int codigoCurso, double percentualCobranca) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.percentualCobranca = percentualCobranca;
        numeroDeMatriculas++;
        this.matricula = "MAT" + numeroDeMatriculas;
    }

    public double calculaMensalidade() {
        return 100.0 * codigoCurso * percentualCobranca;
    }

    public String toString() {
        return String.format("Nome: %s\nMatrícula: %s\nCurso: %d\nPercentual: %.2f\nMensalidade: %.2f",
                nome, matricula, codigoCurso, percentualCobranca, calculaMensalidade());
    }
}
