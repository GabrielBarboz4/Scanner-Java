package br.com.senai;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        String nome1;
        String nome2;
        String nome3;

        Scanner input = new Scanner(System.in);

        System.out.println("Me diga um nome");
        nome1 = input.nextLine();

        //input.nextLine();

        System.out.println("Me diga outro nome");
        nome2 = input.nextLine();

        //input.nextLine();

        System.out.println("Me de mais um nome");
        nome3 = input.nextLine();

        System.out.println("Os nomes digitados foram: " + nome1 + ", " + nome2 + ", " + nome3 + ".");
    }
}
