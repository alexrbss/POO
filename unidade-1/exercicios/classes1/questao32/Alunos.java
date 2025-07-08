/*
    32) Escreva umaclasse cujos objetos representam alunos matriculados em uma disciplina da Ufersa. Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova (P1 e P2) e 1nota detrabalho (T). Escreva os seguintes métodos para esta classe:
        • media: calcula a média parcial do aluno (MP)– cada prova tem peso 2,5 e o trabalho tem peso 2 (MP = 2,5×P1+2,5×P2+2×T/7)
        • provaFinal: calcula quanto o aluno precisa para o exame final (EF)
            – retorna zero se oalunonãonecessita realizar o exame final (MP < 3 ou MP >= 7) 
            – média final MF = (MP×6+EF×4)/10 
            – é necessário que MF seja maior ou igual a 5 para que o aluno seja aprovado após realizar o exame final
    Escreva um aplicativo de teste que demonstre as capacidades da classe criada.
*/
package exercicios.classes1.questao32;

public class Alunos {
    private int matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    // Construtor
    public Alunos(int matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public double media() {
        return ((2.5 * notaProva1) + (2.5 * notaProva2) + (2 * notaTrabalho)) / 7;
    }

    public double provaFinal(double notaExameFinal) {
        double mediaAluno = media();
        if (mediaAluno < 3 || mediaAluno >= 7) {
            return 0; // Aluno não necessita realizar o exame final
        } else {
            mediaAluno = ((mediaAluno * 6) + (notaExameFinal * 4)) / 10;
        }

        return mediaAluno;
    }

        public String toString() {
            double mp = media();
            String status;
            if (mp >= 7) {
                status = "Aprovado";
            } else if (mp < 3) {
                status = "Reprovado";
            } else {
                status = "Exame Final";
            }
            return String.format(
                "Matrícula: %d\nNome: %s\nNota P1: %.2f\nNota P2: %.2f\nNota Trabalho: %.2f\nMédia Parcial: %.2f\nStatus: %s",
                matricula, nome, notaProva1, notaProva2, notaTrabalho, mp, status
            );
    }
}
