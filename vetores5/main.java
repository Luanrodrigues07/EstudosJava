package vetores5;

import java.util.Locale;
import java.util.Scanner;
import vetores5.rent;

public class main {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        rent[] vect = new rent[10];

        System.out.println();
        System.out.println("Bem vindo o Hotel Maresias!");
        System.out.println("quantos quartos serão alugados ?");
        int n = sc.nextInt();
    
        for (int i = 1; i<n; i++) {
            System.out.println();
            System.out.println("insira os dados da pessoa "+(i+1));
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Quarto: ");
            int quarto = sc.nextInt();

            vect[quarto] = new rent(nome, email);
            
         }
         System.out.println();
         System.out.println("Quarto alugados");
         for (int i = 0; i<n; i++){
            if (vect[i] != null){
            System.out.println(i +": "+vect[i]);
            }
         }
         sc.close();
     }
 }
  