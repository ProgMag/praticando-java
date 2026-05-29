package alura.praticando.java.lacosrepeticao.questaotres;

public class SomaNumerosPares {
    public static void main(String[] args) {

        int somarNumerosPares = 0;

        int resultadoSoma = somarPares(somarNumerosPares);

        System.out.println("A soma dos números pares de 1 a 100 é: " + resultadoSoma);
    }

    static int somarPares(int somarNumerosPares) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somarNumerosPares += i;
            }
        }
        return somarNumerosPares;
    }
}
