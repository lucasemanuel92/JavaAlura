package CatalogoFilme;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2001;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 9.2;
        String tipPlano = "standard";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme clássico. Vale a pena assistir!");
        }

        // Não é necessário colocar o "boolean == true"
        // Para usar o termo OU "||" e para usar o termo E "&&"
        if (incluidoNoPlano == true || tipPlano.equals("plus")) { // ".equals()" é comparação de igualdade para strings
            System.out.println("Filme liberado. Divirta-se");
        } else {
            System.out.println("É necessário pagar o aluguel do filme.");
        }

    }
}
