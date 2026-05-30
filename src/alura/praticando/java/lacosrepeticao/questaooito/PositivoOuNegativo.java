package alura.praticando.java.lacosrepeticao.questaooito;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalNegativos = 0;
        int totalPositivos = 0;

        verificarNumeros(input, totalNegativos, totalPositivos);

        input.close();
    }

    static void verificarNumeros(Scanner input, int totalPositivos, int totalNegativos) {
        while (true) {

            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            String escolha = input.nextLine().trim();

            if (escolha.equalsIgnoreCase("fim")) {
                break;
            }

            try {
                int numeroPositivoNegativo = Integer.parseInt(escolha);

                if (numeroPositivoNegativo < 0) {
                    totalNegativos++;
                } else if (numeroPositivoNegativo > 0) {
                    totalPositivos++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
        }

        System.out.println("Números positivos: " + totalPositivos);
        System.out.println("Números negativos: " + totalNegativos);
    }
}
