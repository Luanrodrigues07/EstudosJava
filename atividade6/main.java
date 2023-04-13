package atividade6;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class main {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        int saldo ;
        int conta = rand.nextInt(10000) + 1;

        System.out.println("------------------------------------");
        System.out.println("Bem vindo!");
        System.out.println("O numero da sua conta é: "+conta);
        System.out.println();
        System.out.println("informe seu salado inicial: ");
        saldo = sc.nextInt();
        System.out.println("------------------------------------");
        while(true){
            System.out.println("Escolha uma Opção: ");
            System.out.println("(1). Deposito");
            System.out.println("(2). Saque");
            System.out.println("(3). Consultar dados");
            System.out.println("(4). Sair");
            System.out.println();
            System.out.println("------------------------------------");
            int opcao = sc.nextInt();

            if (opcao == 1){
                System.out.println("------------------------------------");
                System.out.println("Quanto quer depositor ?");
                System.out.println("------------------------------------");

                int valor = sc.nextInt();
                saldo += valor;
                System.out.println("------------------------------------");
                System.out.println();
                System.out.println("Seu deposito foi efetuado!");
                System.out.println("Valor da conta: "+saldo);
                System.out.println("------------------------------------");
            }
            else if (opcao == 2){
                System.out.println("------------------------------------");
                System.out.println("quanto deseja sacar ?");
                System.out.println("------------------------------------");
                int valor = sc.nextInt();
                if (valor <= saldo){
                    saldo -= valor;
                System.out.println("------------------------------------");
                System.out.println();
                System.out.println("Saque realizado com Sucesso!");
                System.out.println("Valor na conta: "+saldo);
                System.out.println();
                System.out.println("------------------------------------");
            } else {
                    System.out.println("------------------------------------");
                    System.out.println("Valor exede seu saldo!");
                    System.out.println("------------------------------------");

                }
            } else if (opcao == 3){
                System.out.println("------------------------------------");
                System.out.println("O valor da sua conta é: "+saldo);
                System.out.println("Numero da conta: "+conta);
                System.out.println("------------------------------------");
            } else if (opcao == 4){
                System.out.println("------------------------------------");
                System.out.println("Até uma proxima!");
                System.out.println("------------------------------------");
                break;
            }
            }


        }

       
}

