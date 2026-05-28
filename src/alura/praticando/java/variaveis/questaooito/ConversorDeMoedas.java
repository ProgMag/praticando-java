package alura.praticando.java.variaveis.questaooito;

import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cotacaoAtual = 5.06d;

        double valorEmReal = input.nextDouble();

        double valorEmDola = valorEmReal / cotacaoAtual;

        System.out.format("""
                %.2f reias é %.2f dólares
                """, valorEmReal, valorEmDola);

        input.close();
    }
}
