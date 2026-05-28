package alura.praticando.java.ifeelse.questaodois;

import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = input.nextDouble();

        System.out.println("Digite a quarta nota:");
        double nota4 = input.nextDouble();

        double mediaDoAluno = calcularMedia(nota1, nota2, nota3, nota4);
        verificarAprovacao(mediaDoAluno);

        input.close();
    }

    public static void verificarAprovacao(double mediaDoAluno) {
        if (mediaDoAluno >= 7.0) {
            System.out.println("O estudante teve média " + mediaDoAluno + " e foi aprovado.");
        } else if (mediaDoAluno >= 5.8) {
            System.out.println("O estudante teve média " + mediaDoAluno + " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + mediaDoAluno + " e foi reprovado.");

        }
    }

    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
