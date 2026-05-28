package alura.praticando.java.ifeelse.questaotres;

import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a senha:");
        String minhaSenha = input.nextLine();

        validarSenha(minhaSenha);

        input.close();
    }

    public static void validarSenha(String minhaSenha) {

        String senha = "123456";

        if (minhaSenha.equals(senha)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Senha invalida");
        }
    }
}
