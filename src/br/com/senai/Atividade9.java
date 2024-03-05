package br.com.senai;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        double porctInss = 0.09;
        Scanner input = new Scanner(System.in);

        String nomeFuncionario;
        System.out.println("Digite o nome do funcionario");
        nomeFuncionario = input.nextLine();

        double salarioBruto;
        System.out.println("Digite o valor do seu salário");
        salarioBruto = input.nextDouble();

        double inss = salarioBruto * porctInss;
        double salarioLiquido = salarioBruto - inss;

        System.out.println("O salario bruto de " + nomeFuncionario + "é de R$" + salarioBruto);
        System.out.println("O desconto do INSS foi de R$ " + inss);
        System.out.println("O salario líquido ficou em R$ " + salarioLiquido);
    }
}
