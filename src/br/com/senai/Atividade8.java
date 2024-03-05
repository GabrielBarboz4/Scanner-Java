package br.com.senai;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioFixo = 500;
        double comissao = 50;
        double quantidadesVendidas;

        System.out.println("Digite a quantidade de Softwares vendidos no mes");
        quantidadesVendidas = input.nextDouble();

        double bonus = quantidadesVendidas * comissao;
        double salarioFinal = bonus + salarioFixo;

        System.out.println("O bonus no mes foi de R$ " + bonus);
        System.out.println("O salario final foi de R$ " + salarioFinal);
    }
}
