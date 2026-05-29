package alura.praticando.java.ifeelse.questaodez;

import java.util.Scanner;

public class VerificacaoCodigo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codigo = 2023;
        int nivelPermissaoMinimo = 1;
        int nivelPermissaoMaximo = 3;

        System.out.println("Digite o código de acesso: ");
        int codigoUsuario = input.nextInt();

        System.out.println("Digite o nível de permissão: ");
        int nivelPermissao = input.nextInt();

        boolean codigoCorreto = codigoUsuario == codigo; // true
        boolean permissaoCorreta = nivelPermissao >= nivelPermissaoMinimo && nivelPermissao <= nivelPermissaoMaximo; // true

        verificarPermissao(codigoCorreto, permissaoCorreta);

        input.close();
    }

    public static void verificarPermissao(boolean codigo, boolean nivelPermissao) {
        if (codigo && nivelPermissao) { // true
            System.out.println("Acesso permitido. Bem-vindo ao sistema!");
        } else if (!(codigo)) { // false
            System.out.println("Acesso negado. Senha incorreta");
        } else {
            System.out.println("Acesso negado. Nível de permissão errado");
        }
    }
}
