package br.com.senai;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        int idade;
        double salario;

        System.out.println("Digite seu nome");
        nome = input.nextLine();

        System.out.println("Digite sua idade");
        idade = input.nextInt();

        System.out.println("Digite seu salário");
        salario = input.nextDouble();

        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é " + idade + " anos");
        System.out.println("Seu salário é de R$ " + salario);
    }
}
