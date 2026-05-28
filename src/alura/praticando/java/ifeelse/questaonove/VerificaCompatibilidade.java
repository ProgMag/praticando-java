package alura.praticando.java.ifeelse.questaonove;

import java.util.Scanner;

public class VerificaCompatibilidade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade do doador: ");
        int idade = input.nextInt();

        System.out.println("Digite o peso do doador (em kg): ");
        double peso = input.nextDouble();

        verificarCompatibilidade(idade, peso);

        input.close();
    }

    public static void verificarCompatibilidade(int idade, double peso) {
        if (idade >= 18 && idade <= 65 && peso > 50) {
            System.out.println("O doador é compatível.");
        } else if (idade < 18 && peso < 50) {
            System.out.println("""
                    O doador não é compatível.
                    Motivo: Deve ter entre 18 e 65 anos e deve ter mais de 50kg.
                    """);
        } else if (idade < 18) {
            System.out.println("""
                    O doador não é compatível.
                    Motivo: Deve ter entre 18 e 65 anos.
                    """);
        } else {
            System.out.println("""
                    O doador não é compatível.
                    Motivo: Deve ter mais de 50kg.
                    """);
        }
    }
}
