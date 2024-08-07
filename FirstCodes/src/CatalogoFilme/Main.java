package CatalogoFilme;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: The Lord of the Rings - The Fellowship of the Ring");

        // Sintaxe básica "tipo nomeDaVariavel = valorDaVariavel"
        // Por padrão a variável começa com letra MINÚSCULA e as outras iniciais MAIÚSCULAS (camelCase)
        int anoDeLancamento = 2001;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.3;

        // É possível fazer calculos direto no código
        double mediaDaNota = (9.5 + notaDoFilme + 8) / 3;
        System.out.println(mediaDaNota);

        // Para escrever com multiplas linhas é só usar tres aspas duplas """ """
        String sinopse;
        sinopse = "Conta a história da formação da Sociedade do Anel rumo a Mordor";
        System.out.println(sinopse + ", " + anoDeLancamento);
    }
}
