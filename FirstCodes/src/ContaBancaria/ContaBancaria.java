package ContaBancaria;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Lucas Carvalho";
        double saldo = 3500.00;
        String tipoConta = "Conta Corrente";
        int opcao = 0;

        System.out.println("Bem vindo Lucas.\n");
        System.out.printf("Seu saldo é de R$ %.2f\n", saldo);
        String menu = "O que deseja fazer?\n" +
                "1 - Ver seu saldo\n" +
                "2 - Receber transferencia\n" +
                "3 - Fazer transferencia\n" +
                "4 - Sair\n";

        Scanner entrada = new Scanner(System.in);

       while (opcao != 4) {
           System.out.println(menu);
           opcao = entrada.nextInt();
           if (opcao == 1) {
               System.out.printf("Seu saldo é de %.2f", saldo);

           } else if (opcao == 2) {
               System.out.println("Qual valor será depositado: ");
               double valor = entrada.nextDouble();
               saldo = saldo + valor;
               System.out.printf("Seu novo saldo é de %.2f", saldo);

           } else if (opcao == 3) {
               System.out.println("Qual valor deseja enviar: ");
               double valor = entrada.nextDouble();
               if (valor > saldo) {
                   System.out.println("É impossível enviar esse valor, por favor consulte seu saldo e tente novamente");
               } else {
                   saldo = saldo - valor;
                   System.out.printf("Seu novo saldo é de %.2f", saldo);
               }
           } else if (opcao == 4) {
               System.out.println("Obrigado por usar nossos serviços");
           }
       }
    }
}
