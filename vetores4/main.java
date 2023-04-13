package vetores4;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitas ?");

        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] altura = new double[n];

        for(int i = 0; i<n; i ++){
            System.out.println("Insira os dados da pessoa "+(i+1));
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            altura[i] = sc.nextDouble();
            }
            double soma = 0.0;
        for(int i = 0; i<n; i++){
            soma = soma + altura[i];
        }
        double mediaAlturas = soma /n;
        System.out.println();
        System.out.printf("A média das alturas é: %.2f%n", mediaAlturas);
        System.out.println();

        int cont = 0; 
        for(int i = 0; i<n; i++){
            if(idades[i] < 16){
                cont = cont + 1; 
            }
        } 
            double percent = cont * 100.0 / n; 

            System.out.printf("A porcentagem de pessoas menores de 16 é: ", percent);
        for (int i = 0; i<n;i++){
            if (idades[i] < 16){
             System.out.println(nomes[i]);

                }
            }
        }
    }