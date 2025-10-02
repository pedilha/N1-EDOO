package br.com.aula;
import br.com.aula.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("Bem vindo ao hospital");
        System.out.println("Se deseja fazer um cadastro digite [1]\nSe deseja fazer uma consulta de dados digite [2]");
        opc = sc.nextInt();
        if (opc == 1) {

            System.out.println("Digite o nome do cadastro: ");
            String nome = sc.next();
            System.out.println("Digite a idade do cadastro: ");
            int idade = sc.nextInt();

        }
    }
}