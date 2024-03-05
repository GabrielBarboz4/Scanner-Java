package br.com.senai;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        double precoCusto;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor gasto na producao do carro");
        precoCusto = input.nextDouble();

        double precoRevendedor = precoCusto * 0.25;
        double precoImposto = precoCusto * 0.45;
        double precoFinal = precoCusto + precoRevendedor + precoImposto;

        System.out.println("O preco de fabrica é de R$ " + precoCusto);
        System.out.println("A porcetagem do revendedor é de R$" + precoRevendedor);
        System.out.println("A aliquota do imposto corresponde a R$ " + precoImposto);
        System.out.println("O preco final do veiculo é de R$ " + precoFinal);


    }
}
