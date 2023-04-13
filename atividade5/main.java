package atividade5;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dolarPrice;
        double amount;

        System.out.println("Welcome to Convert Doll");
        System.out.println();
        System.out.println("What is the dollar price ? ");
         dolarPrice = sc.nextDouble();
         System.out.println("how much do you want to exchange?");
         amount = sc.nextDouble();

         double bruto = dolarPrice * amount;
         double IOF = bruto * 6 /100;
         double liquido = bruto + IOF;

         System.out.println();
         System.out.println("Amount to be paid in reais:    "+liquido);


        


        
    }
}