package alura.praticando.java.lacosrepeticao.questaocinco;

import java.util.Scanner;

public class EncontraMaiorNumero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] listaNumeros = new int[5];

        System.out.println("Digite os 5 números separados por espaço");

        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = input.nextInt();
        }

        int maiorNumero = listaNumeros[0];

        for (int i = 1; i < listaNumeros.length; i++) {
            if (listaNumeros[i] > maiorNumero) {
                maiorNumero = listaNumeros[i];
            }
        }

        System.out.println("O maior número é: " + maiorNumero);
    }
}
