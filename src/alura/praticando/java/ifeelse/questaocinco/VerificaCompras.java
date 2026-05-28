package alura.praticando.java.ifeelse.questaocinco;

import java.util.Scanner;

public class VerificaCompras {
    public static void main(String[] args) {

        double desconto = 0.1;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor da comprar?");
        double valor = input.nextDouble();

        double valorComDesconto = calcularDesconto(valor, desconto);
        verificarCompras(valor, valorComDesconto, desconto);

    }

    public static void verificarCompras(double valorDaCompra, double valorComDesconto, double desconto) {

        if (valorDaCompra >= 100) {
            System.out.println("Desconto de " + desconto + "% aplicado");
            System.out.println("Novo valor: R$" + valorComDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado");
            System.out.println("Novo valor: R$" + valorDaCompra);
        }
    }

    public static double calcularDesconto(double valorDaCompra, double desconto) {
        return valorDaCompra - (valorDaCompra * desconto);

    }
}
