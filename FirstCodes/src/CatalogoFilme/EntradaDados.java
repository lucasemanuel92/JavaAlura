package CatalogoFilme;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        System.out.println("Digite o nome do seu filme favorito: ");
        String filme = entradaDados.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int ano = entradaDados.nextInt();

        System.out.println("Qual a avaliação: ");
        double avaliacao = entradaDados.nextDouble();

        // Os valores %s é para String, %d para int
        System.out.printf("Dados do Filme: %s, %d, %.2f", filme, ano, avaliacao);

        entradaDados.close();
    }
}
