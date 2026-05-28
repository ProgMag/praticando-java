package alura.praticando.variaveis.questaoseis;

import java.util.Scanner;

public class ClassificacaoCategoria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double preco = input.nextDouble();

        if (preco <= 50) {
            System.out.println("Categoria: econômico.");
        } else if (preco >= 50.01 && preco <= 200) {
            System.out.println("Categoria: Intermediário.");
        } else {
            System.out.println("Categoria: Premium.");
        }
    }
}

