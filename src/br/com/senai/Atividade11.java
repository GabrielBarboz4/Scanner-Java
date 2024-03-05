package br.com.senai;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valorPrestacao;
        System.out.println("Digite o valor da prestacao");
        valorPrestacao = input.nextDouble();

        double taxaJuros;
        System.out.println("Digite o valor da taxa de juros");
        taxaJuros = input.nextDouble();
        double taxaJurosDecimal = taxaJuros / 100;

        int diasEmAtraso;
        System.out.println("A quantos dias essa parcela está atrasada?");
        diasEmAtraso = input.nextInt();

        double prestacaoComJuros = valorPrestacao + (valorPrestacao * taxaJurosDecimal * diasEmAtraso);
        System.out.println("O valor corrigido para sua prestacao é de R$ " + prestacaoComJuros);

    }
}
