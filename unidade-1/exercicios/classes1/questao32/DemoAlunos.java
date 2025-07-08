package exercicios.classes1.questao32;

public class DemoAlunos {
    public static void main (String[] args) {
        Alunos aluno1 = new Alunos(123, "Maria", 8.0, 7.5, 7.0);
        Alunos aluno2 = new Alunos(456, "João", 2.0, 2.5, 2.0);
        Alunos aluno3 = new Alunos(789, "Ana", 5.0, 4.5, 5.0);

        System.out.println("Aluno 1:");
        System.out.println(aluno1);

        System.out.println("\nAluno 2:");
        System.out.println(aluno2);

        System.out.println("\nAluno 3:");
        System.out.println(aluno3);

        // Exemplo de uso do exame final para o aluno 3
        double mp3 = aluno3.media();
        if (mp3 >= 3 && mp3 < 7) {
            double notaExameFinal = 6.0; // valor de exemplo
            double mf = aluno3.provaFinal(notaExameFinal);
            String statusFinal = (mf >= 5) ? "Aprovado após exame final" : "Reprovado após exame final";
            System.out.printf("Nota Exame Final: %.2f\nMedia Final: %.2f\nStatus Final: %s\n",
                notaExameFinal, mf, statusFinal);
        }
    }
}