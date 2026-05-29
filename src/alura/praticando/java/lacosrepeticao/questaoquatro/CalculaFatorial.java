package alura.praticando.java.lacosrepeticao.questaoquatro;

import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = input.nextDouble();

        double resultadoFatorial = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultadoFatorial);
    }

    static double calcularFatorial(double numero) {
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }
}
