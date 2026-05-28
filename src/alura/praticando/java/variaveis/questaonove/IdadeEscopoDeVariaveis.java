package alura.praticando.java.variaveis.questaonove;

public class IdadeEscopoDeVariaveis {
    public static void main(String[] args) {

        int idade = 10;
        String mensagem;

        if (idade >= 18) {
            mensagem = ("Você é maior de idade.");
        } else {
            mensagem = ("Você é menor de idade.");
        }

        System.out.println(mensagem);

    }
}
