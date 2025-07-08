import java.util.Scanner;
import java.util.Calendar;

public class ValidaCartao {
    public static void main(String[] args) {
        String nome, numero, codigo;
        int mes, ano, mesAtual, anoAtual;
        boolean invalido;

        Scanner leitor = new Scanner(System.in);
        Calendar calendario = Calendar.getInstance();

        mesAtual = calendario.get(Calendar.MONTH) + 1; // Janeiro é 0, então adicionamos 1
        anoAtual = (calendario.get(Calendar.YEAR));
        
        System.out.println("Nome:");
        nome = leitor.nextLine();
        System.out.println("Numero: ");
        numero = leitor.nextLine();
        System.out.println("Codigo: ");
        codigo = leitor.nextLine();
        
        do {
            System.out.println("Mes: ");
            mes = leitor.nextInt();
            System.out.println("Ano: ");
            ano = leitor.nextInt();
            invalido = ano < anoAtual || (ano == anoAtual && mes < mesAtual);
            if (invalido) System.out.println("Cartão Invalido. Tente Novamente!");
        } while (ano < anoAtual || (ano == anoAtual && mes < mesAtual));

        System.err.println("Cartao Validado");

        leitor.close();
    }
}
