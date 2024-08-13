package Exercicios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner escolha = new Scanner(System.in);
        int valorFinal = 0;
        System.out.println("Escolha um numero para calcular a tabuada: ");
        int calculos = escolha.nextInt();

        for (int tabuada = 0; tabuada <= 10; tabuada++) {
            valorFinal = calculos * tabuada;
            System.out.printf("%d * %d = %d \n", calculos, tabuada, valorFinal);
        }

        escolha.close();
    }
}
