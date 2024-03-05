package br.com.senai;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number1;
        double number2;

        System.out.println("Digite um número");
        number1 = input.nextDouble();
        System.out.println("O número digitado foi " + number1 + "\n");

        System.out.println("Digite outro número");
        number2 = input.nextDouble();
        System.out.println("O número digitado foi " + number2 + "\n");

        double soma = number1 + number2;
        double multiplicacao = number1 * number2;
        double divisao = number1 / number2;
        double subtracao = number1 - number2;

        System.out.println("A adicao desses numeros é " + soma);
        System.out.println("A multiplicacao desses numeros é " + multiplicacao);
        System.out.println("A divisao desses numeros é " + divisao);
        System.out.println("A subtracao desses numeros é " + subtracao);

    }
}
