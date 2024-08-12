package CatalogoFilme;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        double media = 0;

        // modelo (iniciando = 0; até quanto vai > valor; quanto incremento por rodada)
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a avaliação para o filme: ");
            double nota  = entradaDados.nextDouble();
            // O texto abaixo é mesma coisa de "media = media + nota" ou seja o que já tem, mas o que vem do loop
            media += nota;
        }
        System.out.printf("A média de notas do filme é: %.2f", media/3);


            entradaDados.close();
    }
}
