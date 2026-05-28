package alura.praticando.java.ifeelse.questaoum;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int numeroPaOuImpar = input.nextInt();

        verificarParOuImpar(numeroPaOuImpar);

    }

    public static void verificarParOuImpar(int numeroPaOuImpar) {
        if (numeroPaOuImpar % 2 == 0) {
            System.out.println(numeroPaOuImpar + " é par");
        } else {
            System.out.println(numeroPaOuImpar + " é ímpar");
        }
    }
}
