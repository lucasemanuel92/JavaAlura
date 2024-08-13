package Exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int fatorial = 1;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;

            System.out.println(fatorial);
        }
        entrada.close();
    }
}
