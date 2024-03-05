package br.com.senai;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPrestacoes;
        System.out.println("Digite a quantidade total de prestacoes que voce IRA pagar");
        totalPrestacoes = input.nextInt();

        int pagasPrestacoes;
        System.out.println("Digite a quantidade total de prestacoes que JÁ foram pagas");
        pagasPrestacoes = input.nextInt();

        double valorPrestacoes;
        System.out.println("Digite o valor de cada prestacao");
        valorPrestacoes = input.nextDouble();

        double totalPago = valorPrestacoes * pagasPrestacoes;
        double saldoDevedor = valorPrestacoes * (totalPrestacoes - pagasPrestacoes);

        System.out.println("O valor total pago até o momento foi de R$ " + totalPago);
        System.out.println("Voce ainda tem R$ " + saldoDevedor + " para pagar");
    }
}
