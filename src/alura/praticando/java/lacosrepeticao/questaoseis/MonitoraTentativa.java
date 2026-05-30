package alura.praticando.java.lacosrepeticao.questaoseis;

import java.util.Scanner;

public class MonitoraTentativa {
    public static void main(String[] args) {

        String SENHA_VALIDA = "1234";

        Scanner input = new Scanner(System.in);

        verificarSenha(SENHA_VALIDA, input);

        input.close();
    }

    static void verificarSenha(String SENHA_VALIDA, Scanner input) {

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.println("Digite sua senha:");
            String senhaUsuario = input.nextLine();

            if (SENHA_VALIDA.equals(senhaUsuario)) {
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
    }
}
