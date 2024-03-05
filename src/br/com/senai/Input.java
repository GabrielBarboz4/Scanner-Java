package br.com.senai;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;
        int numero;
        String nomeCompleto;

        System.out.println("Qual a sua idade?");
        idade = input.nextInt();
        System.out.println("Alerta de terceira idade!!!! Pelo jeito voce tem " + idade + " anos que tal me dizer um numero aleatório?");
        numero = input.nextInt();
        System.out.println("Que numero aleatório em? Precisava ser " + numero +"? Qual o seu nome completo?" );

        input.nextLine(); //precisamos declarar o nextLine() vazio antes de chamar uma entrada tipo String//
        nomeCompleto = input.nextLine();
        System.out.println("Seu nome completo é: " + nomeCompleto);
    }
}
