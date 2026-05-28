package alura.praticando.java.variaveis.questaosete;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numeroParOuImpar = input.nextInt();

        if (numeroParOuImpar % 2 == 0) {
            System.out.println("O número " + numeroParOuImpar + " é par");
        } else {
            System.out.println("O número " + numeroParOuImpar + " é ímpar");
        }

        input.close();
    }
}
