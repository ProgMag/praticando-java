package alura.praticando.java.variaveis.questaodez;

import java.util.Scanner;

public class ConsumoEAutonomia {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o consume médio do seu carro? ");
        double consumoMedio = input.nextDouble();

        System.out.println("Qual a capacidade do tanque? ");
        double capacidadeTanque = input.nextDouble();

        System.out.println("Combustível atua:  ");
        double combustivelAtual = input.nextDouble();

        System.out.println("Qual a distância da sua viagem?  ");
        double distanciaViagem = input.nextDouble();

        double autonomiaMaxima = calcularAutonomiaMaxima(consumoMedio, capacidadeTanque);
        double autonomiaAtual = calcularAutonomiaAtual(consumoMedio, combustivelAtual);

        verificarSePodeViajar(autonomiaAtual, distanciaViagem, autonomiaMaxima);

        input.close();
    }

    public static double calcularAutonomiaMaxima(double consumoMedio, double capacidadeTanque) {
        return consumoMedio * capacidadeTanque;
    }

    public static double calcularAutonomiaAtual(double consumoMedio, double combustivelAtual) {
        return consumoMedio * combustivelAtual;
    }

    public static void verificarSePodeViajar(double autonomiaAtual, double distanciaViagem, double autonomiaMaxima) {
        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Autonomia máxima do veículo: " + autonomiaMaxima + " km");
            System.out.println("Autonomia atual: " + autonomiaAtual + " km");
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer. ");
        } else {
            System.out.println("Você não conseguirá completar a viagem");
        }
    }
}
