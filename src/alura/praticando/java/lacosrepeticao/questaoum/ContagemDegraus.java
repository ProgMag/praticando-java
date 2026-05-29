package alura.praticando.java.lacosrepeticao.questaoum;

import java.util.Scanner;

public class ContagemDegraus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int degraus = input.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau " + i);
        }

        System.out.println("Você chegou ao final");
        input.close();
    }
}
