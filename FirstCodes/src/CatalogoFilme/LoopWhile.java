package CatalogoFilme;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        int quantidadeDeNotas = 0;

        while (nota != -1){
            System.out.println("Digite a nota do filme ou -1 para sair");
            nota = entradaDados.nextDouble();
            quantidadeDeNotas++;
            media += nota/quantidadeDeNotas;
        }
        System.out.printf("A média das notas é %.2f", media);
    }
}
