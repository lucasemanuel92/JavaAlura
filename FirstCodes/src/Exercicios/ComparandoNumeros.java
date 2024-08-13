package Exercicios;

import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int comparadores = 0;

        while (comparadores != 1) {
            System.out.println("Digite um numero: ");
            int numero1 = entrada.nextInt();
            System.out.println("Digite um numero: ");
            int numero2 = entrada.nextInt();
            comparadores++;

            if (numero1 > numero2) {
                System.out.printf("O numero %d é maior que %d", numero1, numero2);
            } else if (numero1 < numero2) {
                System.out.printf("O numero %d é menor que %d", numero1, numero2);
            } else {
                System.out.printf("O numero %d é igual que %d", numero1, numero2);
            }

        }



        entrada.close();
    }
}
