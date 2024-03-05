package br.com.senai;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {

        double nota1;
        double nota2;
        double nota3;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a Nota 1");
        nota1 = input.nextDouble();

        System.out.println("Digite a Nota 2");
        nota2 = input.nextDouble();

        System.out.println("Digite a Nota 3");
        nota3 = input.nextDouble();

        double prova1 = nota1 * 0.2;
        double prova2 = nota2 * 0.3;
        double prova3 = nota3 * 0.5;
        double media = prova1 + prova2 + prova3;

        System.out.println("A media final ficou " + media);

    }
}
