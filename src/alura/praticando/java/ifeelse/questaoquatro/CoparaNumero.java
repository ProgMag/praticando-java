package alura.praticando.java.ifeelse.questaoquatro;

import java.util.Scanner;

public class CoparaNumero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primerio numero: ");
        int primeiroNumero =  input.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundoNumero =  input.nextInt();

        verificarNumeros(primeiroNumero, segundoNumero);

        input.close();
    }

    public static void verificarNumeros(int primeiroNumero, int segundoNumero){
        if (primeiroNumero > segundoNumero) {
            System.out.println(primeiroNumero + " é maior que " + segundoNumero);
        } else if (primeiroNumero < segundoNumero) {
            System.out.println(segundoNumero + " é maior que " + primeiroNumero);
        } else {
            System.out.println(primeiroNumero + " é igual a " + segundoNumero);
        }
    }
}
