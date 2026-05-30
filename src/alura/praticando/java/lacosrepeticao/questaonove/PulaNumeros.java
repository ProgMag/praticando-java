package alura.praticando.java.lacosrepeticao.questaonove;

import java.util.Scanner;

public class PulaNumeros {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        imprimirNumeros(numero);

    }

    static void imprimirNumeros(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 10 == 5) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}