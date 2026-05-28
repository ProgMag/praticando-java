package alura.praticando.java.ifeelse.questaosete;

import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo");
        double valorEmprestimo = input.nextDouble();

        verificarIntervalo(valorEmprestimo);

        input.close();
    }

    public static void verificarIntervalo(double valorEmprestimo){
        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000){
            System.out.println("O valor " + valorEmprestimo + ", está dentro do intervalo permitido para empréstimo");
        } else {
            System.out.println("O valor " + valorEmprestimo + ", não está dentro do intervalo permitido para empréstimo");
        }
    }
}
