package alura.praticando.variaveis.atividadetres;

public class PrimitivosEmAcao {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;

        double media = (nota1 + nota2 + nota3) / 3;
        int medeiaInteira = (int) media;

        System.out.format("A média das notas é: %.2f \n", media);
        System.out.println("A média inteira é: " + medeiaInteira);
    }
}
