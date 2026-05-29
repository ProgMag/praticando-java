package alura.praticando.java.ifeelse.questaonove;

import java.util.Scanner;

public class VerificaCompatibilidade {
    public static void main(String[] args) {

        int idadeMinima = 18;
        int idadeMaxima = 65;
        int peso = 50;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a idade do doador: ");
        int idadeUsuario = input.nextInt();

        System.out.println("Digite o peso do doador (em kg): ");
        int pesoUsuario = input.nextInt();

        boolean idadeCorreta = idadeUsuario >= idadeMinima && idadeUsuario <= idadeMaxima;
        boolean pesoCorreto = pesoUsuario >= peso;

        verificarCompatibilidade(idadeCorreta, pesoCorreto);

        input.close();
    }

    public static void verificarCompatibilidade(boolean idadeCorreta, boolean pesoCorreto) {
        if (idadeCorreta && pesoCorreto) {
            System.out.println("O doador é compatível.");
        } else if (!pesoCorreto && !idadeCorreta) {
            System.out.println("""
                    O doador não é compatível.
                    Motivo: Deve ter entre 18 anos e 65 anos e deve ter mais de 50kg..
                    """);
        } else if (!idadeCorreta) {
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
