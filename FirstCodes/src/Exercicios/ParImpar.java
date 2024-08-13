package Exercicios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha um numero: ");
        int valorEscolhido = entrada.nextInt();


        if(valorEscolhido % 2 == 0){
            System.out.printf("O numero %d é par!", valorEscolhido);
        } else {
            System.out.printf("O numero %d é impar!", valorEscolhido);
        }

        entrada.close();
    }
}
