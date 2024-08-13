package Exercicios;

import java.util.Scanner;

public class SinalNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = entrada.nextInt();

        if (numero >= 0) {
            System.out.printf("O numero %d é positivo", numero);
        } else {
            System.out.printf("O numero %d é negativo", numero);
        }

        entrada.close();
    }
}
