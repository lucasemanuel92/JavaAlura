package Exercicios;

import java.util.Scanner;

public class AreaQuadradoCirculo {
    public static void main(String[] args) {
        System.out.println("Para calcular a área do quadrado digite 1");
        System.out.println("Para calcular a área da circunferencia digite 2");

        Scanner escolhaArea = new Scanner(System.in);
        int escolha = escolhaArea.nextInt();

        if (escolha == 1) {
            Scanner area1 = new Scanner(System.in);
            System.out.println("Digite o lado do quadrado: ");
            double lado = area1.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.printf("A área do quadrado é %.2f", areaQuadrado);

            area1.close();
        } else if (escolha == 2) {
            Scanner area2 = new Scanner(System.in);
            System.out.println("Digite o raio da circunferencia: ");
            double raio = area2.nextDouble();
            double areaCircunferencia =  Math.PI * Math.pow(raio, 2); // Math.pow(string, potencia)
            System.out.printf("A área de circunferencia é %.2f", areaCircunferencia);
        } else {
            System.out.println("Essa opção não está definida");
        }


        escolhaArea.close();
    }
}
