package alura.praticando.java.ifeelse.questaooito;

import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        double primeiroLado = input.nextDouble();

        System.out.println("Digite o segundo lado: ");
        double segundoLado = input.nextDouble();

        System.out.println("Digite o terceiro lado: ");
        double terceiroLado = input.nextDouble();

        verificarTriangulo(primeiroLado, segundoLado, terceiroLado);

        input.close();
    }

    public static void verificarTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 < lado2 + lado3 &&
                lado2 < lado1 + lado3 &&
                lado3 < lado1 + lado2) {
            System.out.println("É um triângulo");
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
