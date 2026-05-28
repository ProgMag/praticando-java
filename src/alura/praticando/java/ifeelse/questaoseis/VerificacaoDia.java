package alura.praticando.java.ifeelse.questaoseis;

import java.util.Scanner;

public class VerificacaoDia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dia da semana (em letras minúsculas):");
        String diaUtil = input.nextLine();

        verificarDiaDaSemana(diaUtil);

        input.close();
    }

    public static void verificarDiaDaSemana(String diaUtil) {
        if (!diaUtil.equals("sábado") && !diaUtil.equals("domingo")) {
            System.out.println(diaUtil + " é um dia útil.");
        } else {
            System.out.println(diaUtil + " não é um dia útil.");
        }
    }
}
