package alura.praticando.java.lacosrepeticao.questaodois;

import java.util.Arrays;

public class SomaNumeros {
    public static void main(String[] args) {

        int[] valores = {10, 20, 30, 40, 50};

        int totalReceita = somarReceita(valores);
        System.out.println("A soma da receita teve como resultado: R$" + totalReceita);

    }

    public static int somarReceita(int[] valores) {
        int somaValores = 0;

        for (int valor : valores) {
            somaValores += valor;
        }
        return somaValores;

        // Um código mais moderno
        // return Arrays.stream(valores).sum();
    }
}
