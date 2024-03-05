package br.com.senai;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioFixo = 800;
        double porcentagemVendas = 0.15;
        double vendasTotais;

        System.out.println("Digite o valor total de vendas no mes");
        vendasTotais = input.nextDouble();

        double comissao = porcentagemVendas * vendasTotais;
        double salarioTotal = salarioFixo + comissao;

        System.out.println("Salario fixo = R$ " + salarioFixo);
        System.out.println("Valor da comissao = R$ " + comissao);
        System.out.println("Salario final = R$ " + salarioTotal);


    }
}
