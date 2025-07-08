package unidade2.exercicios.arrays.exercicio50;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DemoCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> lista = new ArrayList<>();

        int id, idade, telefone;
        String nome;

        do {
            System.out.println("Informe os dados do cliente: ");
            System.out.print("ID: ");
            id = sc.nextInt();
            if (id < 0) {
                break;
            }
            sc.nextLine();
            System.out.println("Nome: ");
            nome = sc.nextLine();
            System.out.println("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Telefone: ");
            telefone = sc.nextInt();
            sc.nextLine();

            Cliente cliente = new Cliente(id, nome, idade, telefone);
            lista.add(cliente);
        } while (true);

        System.out.println("\nClientes Registrados: ");
        for (Cliente cliente : lista) {
            System.out.println(cliente);
        }

        sc.close();
    }
}
