package alura.praticando.java.lacosrepeticao.questaosete;

import java.util.Scanner;

public class PedindoUmNome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;

        do {
            System.out.println("Digite seu nome: ");
            nome = input.nextLine();

            if (nome.length() < 3) {
                System.out.println("Nome inválido. Digite novamente.");
            }
        } while (nome.length() < 3);

        System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
        input.close();
    }
}
