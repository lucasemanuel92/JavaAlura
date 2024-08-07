package Exercicios;

import java.util.Scanner;

// Crie um programa que vai converter de celsius para fahrenheit
public class Temperatura {
    public static void main(String[] args) {
        System.out.println("Conversão de temperatura");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura em Celsius: ");
        double temperatura = scanner.nextDouble();


        double temperaturaFahrenheit = (temperatura * 1.8) + 32;

        System.out.printf("A temperatura em Fahrenheit é %.2f", temperaturaFahrenheit);
        scanner.close();
    }
}
