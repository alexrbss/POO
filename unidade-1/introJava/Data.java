import java.util.Scanner;

public class Data {
    public static void main (String[] arg) {
        Scanner leitor = new Scanner(System.in);

        int dia, mes, ano, diasMes;

        System.out.print("Dia: ");
        dia = leitor.nextInt();
        System.out.print("Mes: ");
        mes = leitor.nextInt();
        System.out.print("Ano: ");
        ano = leitor.nextInt();

        System.out.print(dia + " de ");
        if (mes == 1) {
            System.out.print("janeiro");
        } else if (mes == 2) {
            System.out.print("fevereiro");
        } else if (mes == 3) {
            System.out.print("marco");
        } else if (mes == 4) {
            System.out.print("abril");
        } else if (mes == 5) {
            System.out.print("maio");
        } else if (mes == 6) {
            System.out.print("junho");
        } else if (mes == 7) {
            System.out.print("julho");
        } else if (mes == 8) {
            System.out.print("agosto");
        } else if (mes == 9) {
            System.out.print("setembro");
        } else if (mes == 10) {
            System.out.print("outubro");
        } else if (mes == 11) {
            System.out.print("novembro");
        } else {
            System.out.print("dezembro");
        }

        System.out.println(" de " + ano);

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 2:
                diasMes = 28;
                break;
            default:
                diasMes = 30;
                break;
        }

        System.out.print("O mes informado tem " + diasMes + " dias ");

        leitor.close();
    }
}
