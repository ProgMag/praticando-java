package alura.praticando.java.variaveis.atividadequatro;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em grau Celsius: ");

        int grauCelsius = input.nextInt();

        double fahrenheit = calcularTemperaturaFahrenheit(grauCelsius);

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        input.close();
    }

    public static double calcularTemperaturaFahrenheit(double temperaturaCelsius) {
            return (temperaturaCelsius * (9 / 5)) + 32;
    }
}
